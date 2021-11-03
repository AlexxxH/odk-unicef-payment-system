package org.odk.collect.android.feature.formentry.backgroundlocation;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import android.Manifest;

import androidx.test.core.app.ApplicationProvider;
import androidx.test.rule.GrantPermissionRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;
import org.odk.collect.android.R;
import org.odk.collect.android.support.CopyFormRule;
import org.odk.collect.android.support.FormActivityTestRule;
import org.odk.collect.android.support.TestRuleChain;
import org.odk.collect.android.support.pages.FormEntryPage;

public class SetGeopointActionTest {
    private static final String SETGEOPOINT_ACTION_FORM = "setgeopoint-action.xml";

    public FormActivityTestRule rule = new FormActivityTestRule(SETGEOPOINT_ACTION_FORM, "setgeopoint-action-instance-load");

    @Rule
    public RuleChain copyFormChain = TestRuleChain.chain()
            .around(GrantPermissionRule.grant(Manifest.permission.ACCESS_FINE_LOCATION))
            .around(new CopyFormRule(SETGEOPOINT_ACTION_FORM, true))
            .around(rule);

    @Test
    public void locationCollectionSnackbar_ShouldBeDisplayedAtFormLaunch() {
        new FormEntryPage("setgeopoint-action-instance-load").assertOnPage();
        onView(withId(com.google.android.material.R.id.snackbar_text))
                .check(matches(withText(String.format(ApplicationProvider.getApplicationContext().getString(R.string.background_location_enabled), "⋮"))));
    }

    /**
     * Could be replaced in test for {@link org.odk.collect.android.formentry.FormEntryMenuDelegate}
     */
    @Test
    public void locationCollectionToggle_ShouldBeAvailable() {
        new FormEntryPage("setgeopoint-action-instance-load").assertOnPage()
                .clickOptionsIcon()
                .assertText(R.string.track_location);
    }
}
