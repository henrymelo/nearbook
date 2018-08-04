package br.com.caelum.casadocodigo.activity;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import br.com.caelum.casadocodigo.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void mainActivityTest() {
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.lista_livros),
                        withParent(allOf(withId(R.id.frame_principal),
                                withParent(withId(android.R.id.content)))),
                        isDisplayed()));

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        recyclerView.perform(actionOnItemAtPosition(1, click()));

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.detalhes_livro_comprar_fisico), withText("Comprar livro Fisico - R$ 59.90"), isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction actionMenuItemView = onView(
                allOf(withId(R.id.vai_para_carrinho), withContentDescription("Carrinho"), isDisplayed()));
        actionMenuItemView.perform(click());

        pressBack();

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.detalhes_livro_comprar_ebook), withText("Comprar E-book - R$ 39.90"), isDisplayed()));
        appCompatButton2.perform(click());

        pressBack();

        ViewInteraction recyclerView2 = onView(
                allOf(withId(R.id.lista_livros),
                        withParent(allOf(withId(R.id.frame_principal),
                                withParent(withId(android.R.id.content)))),
                        isDisplayed()));
        recyclerView2.perform(actionOnItemAtPosition(2, click()));

        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.detalhes_livro_comprar_ambos), withText("Comprar Ambos - R$ 79.90"), isDisplayed()));
        appCompatButton3.perform(click());

        ViewInteraction actionMenuItemView2 = onView(
                allOf(withId(R.id.vai_para_carrinho), withContentDescription("Carrinho"), isDisplayed()));
        actionMenuItemView2.perform(click());

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        pressBack();

    }

}
