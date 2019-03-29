package com.example.testapplication;

import android.support.test.rule.ActivityTestRule;
import android.util.Log;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;


public class ActivityTwoTest {
    private static final String STRING_To_Be_TYPED = "Sandy";
    @Rule
    public ActivityTestRule<ActivityTwo> activityTestRule = new ActivityTestRule<>(ActivityTwo.class);
    private ActivityTwo activitytwo = null;

    @Before
    public void setUp() throws Exception {
        activitytwo = activityTestRule.getActivity();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void onCreate() {
        Log.d("TAG","onCreate()");
    }

    @Test
    public void btn_edit_click() throws Exception{

        onView(withId(R.id.et))
                .perform(typeText(STRING_To_Be_TYPED), closeSoftKeyboard());
        onView(withId(R.id.btn_edit)).perform(click());

        Thread.sleep(1000);
        onView(withText(STRING_To_Be_TYPED))
                .inRoot(withDecorView(not(activityTestRule.getActivity().getWindow().getDecorView())));


    }
}