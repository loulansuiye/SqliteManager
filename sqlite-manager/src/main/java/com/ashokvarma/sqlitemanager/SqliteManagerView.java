package com.ashokvarma.sqlitemanager;

import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.util.SparseArray;

import java.util.ArrayList;
import java.util.List;

/**
 * Class description
 *
 * @author ashokvarma
 * @version 1.0
 * @since 17 Jun 2017
 */
interface SqliteManagerView {
    void setSubtitle(String subtitle);

    void finishActivityWithError(@StringRes int errorMessageId);

    void finishActivityWithError(String error);

    void finishActivity();

    @NonNull
    AppCompatActivity getViewContext();

    void displayError(@StringRes int errorMessageId);

    void displayError(String error);

    void setSpinnerAdapter(ArrayList<String> tableNames);

    void showContentView();

    void updateColumnNames(String[] columnNames);

    void displayRows(List<SparseArray<String>> columnIndexToValuesArray);

    void showCustomQueryDialog(String previousCustomQuery);
}