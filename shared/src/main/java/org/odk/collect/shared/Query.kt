package org.odk.collect.shared

import org.odk.collect.shared.Query.And
import org.odk.collect.shared.Query.NumericEq
import org.odk.collect.shared.Query.NumericNotEq
import org.odk.collect.shared.Query.Or
import org.odk.collect.shared.Query.StringEq
import org.odk.collect.shared.Query.StringNotEq

sealed class Query {
    class StringEq(val column: String, val value: String) : Query()
    class StringNotEq(val column: String, val value: String) : Query()
    class NumericEq(val column: String, val value: Double) : Query()
    class NumericNotEq(val column: String, val value: Double) : Query()
    class And(val queryA: Query, val queryB: Query) : Query()
    class Or(val queryA: Query, val queryB: Query) : Query()
}

fun Query.mapColumns(columnMapper: (String) -> String): Query {
    return when (this) {
        is StringEq -> StringEq(columnMapper(column), value)
        is StringNotEq -> StringNotEq(columnMapper(column), value)
        is NumericEq -> NumericEq(columnMapper(column), value)
        is NumericNotEq -> NumericNotEq(columnMapper(column), value)
        is And -> And(
            queryA.mapColumns(columnMapper),
            queryB.mapColumns(columnMapper)
        )
        is Or -> Or(
            queryA.mapColumns(columnMapper),
            queryB.mapColumns(columnMapper)
        )
    }
}
