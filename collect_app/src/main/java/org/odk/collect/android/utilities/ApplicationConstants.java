/*
 * Copyright 2017 Nafundi
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.odk.collect.android.utilities;

import com.google.zxing.integration.android.IntentIntegrator;

public class ApplicationConstants {

    private ApplicationConstants() {

    }

    public abstract static class BundleKeys {
        public static final String SUCCESS_KEY = "SUCCESSFUL";
        public static final String FORM_IDS = "FORM_IDS";
        public static final String MESSAGE = "MESSAGE";
        public static final String USERNAME = "USERNAME";
        public static final String PASSWORD = "PASSWORD";
        public static final String URL = "URL";
        public static final String DELETE_INSTANCE_AFTER_SUBMISSION = "DELETE_INSTANCE_AFTER_SUBMISSION";
    }

    public abstract static class SortingOrder {
        public static final int BY_NAME_ASC = 0;
        public static final int BY_NAME_DESC = 1;
        public static final int BY_DATE_DESC = 2;
        public static final int BY_DATE_ASC = 3;
        public static final int BY_STATUS_ASC = 4;
        public static final int BY_STATUS_DESC = 5;
    }

    public abstract static class RequestCodes {
        public static final int IMAGE_CAPTURE = 1;
        public static final int BARCODE_CAPTURE = IntentIntegrator.REQUEST_CODE;
        public static final int AUDIO_CAPTURE = 3;
        public static final int VIDEO_CAPTURE = 4;
        public static final int LOCATION_CAPTURE = 5;
        public static final int HIERARCHY_ACTIVITY = 6;
        public static final int IMAGE_CHOOSER = 7;
        public static final int AUDIO_CHOOSER = 8;
        public static final int VIDEO_CHOOSER = 9;
        public static final int EX_STRING_CAPTURE = 10;
        public static final int EX_INT_CAPTURE = 11;
        public static final int EX_DECIMAL_CAPTURE = 12;
        public static final int DRAW_IMAGE = 13;
        public static final int SIGNATURE_CAPTURE = 14;
        public static final int ANNOTATE_IMAGE = 15;
        public static final int ALIGNED_IMAGE = 16;
        public static final int BEARING_CAPTURE = 17;
        public static final int EX_GROUP_CAPTURE = 18;
        public static final int OSM_CAPTURE = 19;
        public static final int GEOSHAPE_CAPTURE = 20;
        public static final int GEOTRACE_CAPTURE = 21;
        public static final int ARBITRARY_FILE_CHOOSER = 22;
        public static final int EX_ARBITRARY_FILE_CHOOSER  = 23;
        public static final int EX_VIDEO_CHOOSER  = 24;
        public static final int EX_IMAGE_CHOOSER  = 25;
        public static final int EX_AUDIO_CHOOSER  = 26;
        public static final int CHANGE_SETTINGS = 27;
        public static final int MEDIA_FILE_PATH = 28;
    }

    public abstract static class Namespaces {
        public static final String XML_OPENROSA_NAMESPACE = "http://openrosa.org/xforms";
        public static final String XML_OPENDATAKIT_NAMESPACE = "http://www.opendatakit.org/xforms";
    }
}
