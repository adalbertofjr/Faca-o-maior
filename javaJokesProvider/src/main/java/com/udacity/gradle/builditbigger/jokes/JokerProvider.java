package com.udacity.gradle.builditbigger.jokes;

public class JokerProvider {

    public static final String JOKE =
            "See, there were these two guys in a lunatic asylum… and one night, one night they decide they " +
                    "don\'t like living in an asylum any more. They decide they\re going to escape! " +
                    "So, like, they get up onto the roof, and there, just across the narrow gap, t" +
                    "hey see the rooftops of the town, stretching away in the moonlight… " +
                    "Now, the first guy, he jumps right across with no problem. " +
                    "But his friend, his friend daredn\'t make the leap. Y\'see… y\'see, " +
                    "he\'s afraid of falling. So then, the first guy has an idea…He says " +
                    "\"Hey! I have my flashlight with me! I\'ll shine it across the gap between the buildings. " +
                    "You can walk along the beam and join me!\" B-but the second guy just shakes his head. " +
                    "He suh-says… He says \"wh-what do you think I am? CRAZY? " +
                    "You\'d turn it off when I was half way across!\"";

    public static String getJoke() {
        return JOKE;
    }
}
