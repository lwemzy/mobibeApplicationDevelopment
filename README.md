# Food Decider App 🍽️

A simple Android application that helps users decide what to eat by adding food items and letting the app randomly select one.

## 📱 Layout Overview

The app features a minimalist and user-friendly layout built with `LinearLayout` and `RelativeLayout`, centered around the following UI components:

- **Logo ImageView** — Displays the app logo.
- **TextView** — Shows the selected food item.
- **EditText** — Allows users to input a new food option.
- **Button (Add Food)** — Adds the new food option to the list.
- **Button (Decide)** — Randomly selects one food option for the user.

## 🧩 XML Layout (MainActivity)

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:gravity="center"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <ImageView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center_horizontal"
        android:layout_marginTop="@dimen/view_margin"
        android:contentDescription="@string/txt_img_desc"
        android:src="@drawable/dd_logo" />

    <TextView
        android:id="@+id/txt_foodType"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center_horizontal"
        android:layout_marginTop="@dimen/view_margin"
        android:text=""
        android:textSize="@dimen/text_size" />

    <EditText
        android:id="@+id/txt_addfood"
        android:layout_width="@dimen/input_width"
        android:layout_height="@dimen/input_height"
        android:layout_gravity="center_horizontal"
        android:layout_marginTop="@dimen/large_margin"
        android:hint="@string/add_food_tooltip"
        android:textSize="@dimen/text_size" />

    <Button
        android:id="@+id/btn_addfood"
        android:layout_width="@dimen/btn_width"
        android:layout_height="@dimen/btn_height"
        android:layout_gravity="center_horizontal"
        android:layout_marginBottom="@dimen/view_margin"
        android:text="@string/btn_txt_addfood" />

    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <Button
            android:id="@+id/btn_decide"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_alignParentBottom="true"
            android:text="@string/btn_txt_decide" />
    </RelativeLayout>
</LinearLayout>
