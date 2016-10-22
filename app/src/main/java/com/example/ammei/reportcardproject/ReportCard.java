package com.example.ammei.reportcardproject;

/**
 * Created by ammei on 10/21/2016.
 */

public class ReportCard {

        //Displays course names which student is enrolled for the ReportCard.
        private String mAlgebraII;
        private String mIntroToBiology;
        private String mAmericanLiterature;
        private String mWindEnsemble;
        private String mSpanishII;
        private String mWorldHistory;


        public ReportCard(String algebraII, String introToBiology, String americanLiterature,
                          String windEnsemble, String spanishII, String worldHistory) {

            mAlgebraII = algebraII;
            mIntroToBiology = introToBiology;
            mAmericanLiterature = americanLiterature;
            mWindEnsemble = windEnsemble;
            mSpanishII = spanishII;
            mWorldHistory = worldHistory;

        }

        public void setmAlgebraII(String algebraII) {
            mAlgebraII = algebraII;
        }

        public String getmAlgebraII() {
            return mAlgebraII;
        }

        public void setmIntroToBiology(String introToBiology) {
            mIntroToBiology = introToBiology;
        }

        public String getmIntroToBiology() {
            return mIntroToBiology;
        }

        public void setmAmericanLiterature(String americanLiterature) {
            mAmericanLiterature = americanLiterature;
        }

        public String getmAmericanLiterature() {
            return mAmericanLiterature;
        }

        public void setmWindEnsemble(String windEnsemble) {
            mWindEnsemble = windEnsemble;
        }

        public String getmWindEnsemble() {
            return mWindEnsemble;
        }


        public String getmSpanishII() {
            return mSpanishII;
        }

        public void setmSpanishII(String spanishII) {
            mSpanishII = spanishII;
        }

        public String getmWorldHistory() {
            return mWorldHistory;
        }

        public void setmWorldHistory(String worldHistory) {
            mWorldHistory = worldHistory;
        }

        @Override
        public String toString() {
            return ("\nAlgebraII ") + getmAlgebraII() + ("\nIntro To Biology ") + getmIntroToBiology() + ("\nAmerican Literature ")
                    + getmAmericanLiterature() + ("\nWind Ensemble ") + getmWindEnsemble() + ("\nSpanishII ") + getmSpanishII()
                    + ("\nWorld History") + getmWorldHistory();
        }
    }

