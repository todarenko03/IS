package org.example.configuration;

import java.util.HashMap;
import java.util.Map;

public class TransitionConfiguration {
    private Map<Integer, Map<String, Integer>> transitionMap = new HashMap<>();

    public TransitionConfiguration() {
        initTransitionMap();
    }

    public void initTransitionMap() {
        Map<String, Integer> state0 = new HashMap<>();
        state0.put("E", 1);
        state0.put("T", 2);
        state0.put("F", 3);
        transitionMap.put(0, state0);

        transitionMap.put(1, new HashMap<>());
        transitionMap.put(2, new HashMap<>());
        transitionMap.put(3, new HashMap<>());
        transitionMap.put(4, new HashMap<>());
        transitionMap.put(5, new HashMap<>());

        Map<String, Integer> state6 = new HashMap<>();
        state6.put("E", 19);
        state6.put("T", 20);
        state6.put("F", 21);
        transitionMap.put(6, state6);

        transitionMap.put(7, new HashMap<>());
        transitionMap.put(8, new HashMap<>());

        Map<String, Integer> state9 = new HashMap<>();
        state9.put("T", 28);
        state9.put("F", 3);
        transitionMap.put(9, state9);

        Map<String, Integer> state10 = new HashMap<>();
        state10.put("T", 29);
        state10.put("F", 3);
        transitionMap.put(10, state10);

        Map<String, Integer> state11 = new HashMap<>();
        state11.put("T", 30);
        state11.put("F", 3);
        transitionMap.put(11, state11);

        Map<String, Integer> state12 = new HashMap<>();
        state12.put("T", 31);
        state12.put("F", 3);
        transitionMap.put(12, state12);

        Map<String, Integer> state13 = new HashMap<>();
        state13.put("F", 32);
        transitionMap.put(13, state13);

        Map<String, Integer> state14 = new HashMap<>();
        state14.put("F", 33);
        transitionMap.put(14, state14);

        Map<String, Integer> state15 = new HashMap<>();
        state15.put("F", 34);
        transitionMap.put(15, state15);

        Map<String, Integer> state16 = new HashMap<>();
        state16.put("F", 35);
        transitionMap.put(16, state16);

        Map<String, Integer> state17 = new HashMap<>();
        state17.put("F", 36);
        transitionMap.put(17, state17);

        Map<String, Integer> state18 = new HashMap<>();
        state18.put("F", 37);
        transitionMap.put(18, state18);

        transitionMap.put(19, new HashMap<>());
        transitionMap.put(20, new HashMap<>());
        transitionMap.put(21, new HashMap<>());
        transitionMap.put(22, new HashMap<>());
        transitionMap.put(23, new HashMap<>());

        Map<String, Integer> state24 = new HashMap<>();
        state24.put("E", 49);
        state24.put("T", 20);
        state24.put("F", 21);
        transitionMap.put(24, state24);

        transitionMap.put(25, new HashMap<>());
        transitionMap.put(26, new HashMap<>());

        Map<String, Integer> state27 = new HashMap<>();
        state27.put("E", 52);
        state27.put("T", 53);
        state27.put("F", 54);
        state27.put("E_list", 51);
        transitionMap.put(27, state27);

        transitionMap.put(28, new HashMap<>());
        transitionMap.put(29, new HashMap<>());
        transitionMap.put(30, new HashMap<>());
        transitionMap.put(31, new HashMap<>());
        transitionMap.put(32, new HashMap<>());
        transitionMap.put(33, new HashMap<>());
        transitionMap.put(34, new HashMap<>());
        transitionMap.put(35, new HashMap<>());
        transitionMap.put(36, new HashMap<>());
        transitionMap.put(37, new HashMap<>());
        transitionMap.put(38, new HashMap<>());

        Map<String, Integer> state39 = new HashMap<>();
        state39.put("T", 60);
        state39.put("F", 21);
        transitionMap.put(39, state39);

        Map<String, Integer> state40 = new HashMap<>();
        state40.put("T", 61);
        state40.put("F", 21);
        transitionMap.put(40, state40);

        Map<String, Integer> state41 = new HashMap<>();
        state41.put("T", 62);
        state41.put("F", 21);
        transitionMap.put(41, state41);

        Map<String, Integer> state42 = new HashMap<>();
        state42.put("T", 63);
        state42.put("F", 21);
        transitionMap.put(42, state42);

        Map<String, Integer> state43 = new HashMap<>();
        state43.put("F", 64);
        transitionMap.put(43, state43);

        Map<String, Integer> state44 = new HashMap<>();
        state44.put("F", 65);
        transitionMap.put(44, state44);

        Map<String, Integer> state45 = new HashMap<>();
        state45.put("F", 66);
        transitionMap.put(45, state45);

        Map<String, Integer> state46 = new HashMap<>();
        state46.put("F", 67);
        transitionMap.put(46, state46);

        Map<String, Integer> state47 = new HashMap<>();
        state47.put("F", 68);
        transitionMap.put(47, state47);

        Map<String, Integer> state48 = new HashMap<>();
        state48.put("F", 69);
        transitionMap.put(48, state48);

        transitionMap.put(49, new HashMap<>());

        Map<String, Integer> state50 = new HashMap<>();
        state50.put("E", 52);
        state50.put("T", 53);
        state50.put("F", 54);
        state50.put("E_list", 71);
        transitionMap.put(50, state50);

        transitionMap.put(51, new HashMap<>());
        transitionMap.put(52, new HashMap<>());
        transitionMap.put(53, new HashMap<>());
        transitionMap.put(54, new HashMap<>());
        transitionMap.put(55, new HashMap<>());
        transitionMap.put(56, new HashMap<>());

        Map<String, Integer> state57 = new HashMap<>();
        state57.put("E", 84);
        state57.put("T", 20);
        state57.put("F", 21);
        transitionMap.put(57, state57);

        transitionMap.put(58, new HashMap<>());
        transitionMap.put(59, new HashMap<>());
        transitionMap.put(60, new HashMap<>());
        transitionMap.put(61, new HashMap<>());
        transitionMap.put(62, new HashMap<>());
        transitionMap.put(63, new HashMap<>());
        transitionMap.put(64, new HashMap<>());
        transitionMap.put(65, new HashMap<>());
        transitionMap.put(66, new HashMap<>());
        transitionMap.put(67, new HashMap<>());
        transitionMap.put(68, new HashMap<>());
        transitionMap.put(69, new HashMap<>());
        transitionMap.put(70, new HashMap<>());
        transitionMap.put(71, new HashMap<>());
        transitionMap.put(72, new HashMap<>());

        Map<String, Integer> state73 = new HashMap<>();
        state73.put("E", 52);
        state73.put("T", 53);
        state73.put("F", 54);
        state73.put("E_list", 87);
        transitionMap.put(73, state73);

        Map<String, Integer> state74 = new HashMap<>();
        state74.put("T", 88);
        state74.put("F", 54);
        transitionMap.put(74, state74);

        Map<String, Integer> state75 = new HashMap<>();
        state75.put("T", 89);
        state75.put("F", 54);
        transitionMap.put(75, state75);

        Map<String, Integer> state76 = new HashMap<>();
        state76.put("T", 90);
        state76.put("F", 54);
        transitionMap.put(76, state76);

        Map<String, Integer> state77 = new HashMap<>();
        state77.put("T", 91);
        state77.put("F", 54);
        transitionMap.put(77, state77);

        Map<String, Integer> state78 = new HashMap<>();
        state78.put("F", 92);
        transitionMap.put(78, state78);

        Map<String, Integer> state79 = new HashMap<>();
        state79.put("F", 93);
        transitionMap.put(79, state79);

        Map<String, Integer> state80 = new HashMap<>();
        state80.put("F", 94);
        transitionMap.put(80, state80);

        Map<String, Integer> state81 = new HashMap<>();
        state81.put("F", 95);
        transitionMap.put(81, state81);

        Map<String, Integer> state82 = new HashMap<>();
        state82.put("F", 96);
        transitionMap.put(82, state82);

        Map<String, Integer> state83 = new HashMap<>();
        state83.put("F", 97);
        transitionMap.put(83, state83);

        transitionMap.put(84, new HashMap<>());

        Map<String, Integer> state85 = new HashMap<>();
        state85.put("E", 52);
        state85.put("T", 53);
        state85.put("F", 54);
        state85.put("E_list", 99);
        transitionMap.put(85, state85);

        transitionMap.put(86, new HashMap<>());
        transitionMap.put(87, new HashMap<>());
        transitionMap.put(88, new HashMap<>());
        transitionMap.put(89, new HashMap<>());
        transitionMap.put(90, new HashMap<>());
        transitionMap.put(91, new HashMap<>());
        transitionMap.put(92, new HashMap<>());
        transitionMap.put(93, new HashMap<>());
        transitionMap.put(94, new HashMap<>());
        transitionMap.put(95, new HashMap<>());
        transitionMap.put(96, new HashMap<>());
        transitionMap.put(97, new HashMap<>());
        transitionMap.put(98, new HashMap<>());
        transitionMap.put(99, new HashMap<>());
        transitionMap.put(100, new HashMap<>());

    }

    public Map<Integer, Map<String, Integer>> getTransitionMap() {
        return transitionMap;
    }
}
