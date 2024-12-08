package org.example.configuration;

import java.util.HashMap;
import java.util.Map;

public class ActionConfiguration {
    private Map<Integer, Map<String, String>> actionMap = new HashMap<>();

    public ActionConfiguration() {
        initActionMap();
    }

    public void initActionMap() {

        Map<String, String> state0 = new HashMap<>();
        state0.put("KW_TRUE", "s4");
        state0.put("KW_FALSE", "s5");
        state0.put("SYM_LBRACKET", "s6");
        state0.put("LIT_INTEGER", "s7");
        state0.put("KW_FUNC", "s8");
        actionMap.put(0, state0);

        Map<String, String> state1 = new HashMap<>();
        state1.put("SYM_PLUS", "s9");
        state1.put("SYM_MINUS", "s10");
        state1.put("SYM_VBAR", "s11");
        state1.put("SYM_AMPER", "s12");
        state1.put("END", "a0");
        actionMap.put(1, state1);

        Map<String, String> state2 = new HashMap<>();
        state2.put("SYM_PLUS", "r5");
        state2.put("SYM_MINUS", "r5");
        state2.put("SYM_VBAR", "r5");
        state2.put("SYM_AMPER", "r5");
        state2.put("SYM_STAR", "s13");
        state2.put("SYM_SLASH", "s14");
        state2.put("OP_EQUALS", "s15");
        state2.put("OP_NOT_EQUALS", "s16");
        state2.put("OP_GREATER", "s17");
        state2.put("OP_LESS", "s18");
        state2.put("END", "r5");
        actionMap.put(2, state2);

        Map<String, String> state3 = new HashMap<>();
        state3.put("SYM_PLUS", "r12");
        state3.put("SYM_MINUS", "r12");
        state3.put("SYM_VBAR", "r12");
        state3.put("SYM_AMPER", "r12");
        state3.put("SYM_STAR", "r12");
        state3.put("SYM_SLASH", "r12");
        state3.put("OP_EQUALS", "r12");
        state3.put("OP_NOT_EQUALS", "r12");
        state3.put("OP_GREATER", "r12");
        state3.put("OP_LESS", "r12");
        state3.put("END", "r12");
        actionMap.put(3, state3);

        Map<String, String> state4 = new HashMap<>();
        state4.put("SYM_PLUS", "r13");
        state4.put("SYM_MINUS", "r13");
        state4.put("SYM_VBAR", "r13");
        state4.put("SYM_AMPER", "r13");
        state4.put("SYM_STAR", "r13");
        state4.put("SYM_SLASH", "r13");
        state4.put("OP_EQUALS", "r13");
        state4.put("OP_NOT_EQUALS", "r13");
        state4.put("OP_GREATER", "r13");
        state4.put("OP_LESS", "r13");
        state4.put("END", "r13");
        actionMap.put(4, state4);

        Map<String, String> state5 = new HashMap<>();
        state4.put("SYM_PLUS", "r14");
        state4.put("SYM_MINUS", "r14");
        state4.put("SYM_VBAR", "r14");
        state4.put("SYM_AMPER", "r14");
        state4.put("SYM_STAR", "r14");
        state4.put("SYM_SLASH", "r14");
        state4.put("OP_EQUALS", "r14");
        state4.put("OP_NOT_EQUALS", "r14");
        state4.put("OP_GREATER", "r14");
        state4.put("OP_LESS", "r14");
        state4.put("END", "r14");
        actionMap.put(5, state5);

        Map<String, String> state6 = new HashMap<>();
        state6.put("KW_TRUE", "s22");
        state6.put("KW_FALSE", "s23");
        state6.put("SYM_LBRACKET", "s24");
        state6.put("LIT_INTEGER", "s25");
        state6.put("KW_FUNC", "s26");
        actionMap.put(6, state6);

        Map<String, String> state7 = new HashMap<>();
        state7.put("SYM_PLUS", "r16");
        state7.put("SYM_MINUS", "r16");
        state7.put("SYM_VBAR", "r16");
        state7.put("SYM_AMPER", "r16");
        state7.put("SYM_STAR", "r16");
        state7.put("SYM_SLASH", "r16");
        state7.put("OP_EQUALS", "r16");
        state7.put("OP_NOT_EQUALS", "r16");
        state7.put("OP_GREATER", "r16");
        state7.put("OP_LESS", "r16");
        state7.put("END", "r16");
        actionMap.put(7, state7);

        Map<String, String> state8 = new HashMap<>();
        state8.put("SYM_LBRACKET", "s27");
        actionMap.put(8, state8);

        Map<String, String> state9 = new HashMap<>();
        state9.put("KW_TRUE", "s4");
        state9.put("KW_FALSE", "s5");
        state9.put("SYM_LBRACKET", "s6");
        state9.put("LIT_INTEGER", "s7");
        state9.put("KW_FUNC", "s8");
        actionMap.put(9, state9);

        Map<String, String> state10 = new HashMap<>();
        state10.put("KW_TRUE", "s4");
        state10.put("KW_FALSE", "s5");
        state10.put("SYM_LBRACKET", "s6");
        state10.put("LIT_INTEGER", "s7");
        state10.put("KW_FUNC", "s8");
        actionMap.put(10, state10);

        Map<String, String> state11 = new HashMap<>();
        state11.put("KW_TRUE", "s4");
        state11.put("KW_FALSE", "s5");
        state11.put("SYM_LBRACKET", "s6");
        state11.put("LIT_INTEGER", "s7");
        state11.put("KW_FUNC", "s8");
        actionMap.put(11, state11);

        Map<String, String> state12 = new HashMap<>();
        state12.put("KW_TRUE", "s4");
        state12.put("KW_FALSE", "s5");
        state12.put("SYM_LBRACKET", "s6");
        state12.put("LIT_INTEGER", "s7");
        state12.put("KW_FUNC", "s8");
        actionMap.put(12, state12);

        Map<String, String> state13 = new HashMap<>();
        state13.put("KW_TRUE", "s4");
        state13.put("KW_FALSE", "s5");
        state13.put("SYM_LBRACKET", "s6");
        state13.put("LIT_INTEGER", "s7");
        state13.put("KW_FUNC", "s8");
        actionMap.put(13, state13);

        Map<String, String> state14 = new HashMap<>();
        state14.put("KW_TRUE", "s4");
        state14.put("KW_FALSE", "s5");
        state14.put("SYM_LBRACKET", "s6");
        state14.put("LIT_INTEGER", "s7");
        state14.put("KW_FUNC", "s8");
        actionMap.put(14, state14);

        Map<String, String> state15 = new HashMap<>();
        state15.put("KW_TRUE", "s4");
        state15.put("KW_FALSE", "s5");
        state15.put("SYM_LBRACKET", "s6");
        state15.put("LIT_INTEGER", "s7");
        state15.put("KW_FUNC", "s8");
        actionMap.put(15, state15);

        Map<String, String> state16 = new HashMap<>();
        state16.put("KW_TRUE", "s4");
        state16.put("KW_FALSE", "s5");
        state16.put("SYM_LBRACKET", "s6");
        state16.put("LIT_INTEGER", "s7");
        state16.put("KW_FUNC", "s8");
        actionMap.put(16, state16);

        Map<String, String> state17 = new HashMap<>();
        state17.put("KW_TRUE", "s4");
        state17.put("KW_FALSE", "s5");
        state17.put("SYM_LBRACKET", "s6");
        state17.put("LIT_INTEGER", "s7");
        state17.put("KW_FUNC", "s8");
        actionMap.put(17, state17);

        Map<String, String> state18 = new HashMap<>();
        state18.put("KW_TRUE", "s4");
        state18.put("KW_FALSE", "s5");
        state18.put("SYM_LBRACKET", "s6");
        state18.put("LIT_INTEGER", "s7");
        state18.put("KW_FUNC", "s8");
        actionMap.put(18, state18);

        Map<String, String> state19 = new HashMap<>();
        state19.put("SYM_PLUS", "s39");
        state19.put("SYM_MINUS", "s40");
        state19.put("SYM_VBAR", "s41");
        state19.put("SYM_AMPER", "s42");
        state19.put("SYM_RBRACKET", "s38");
        actionMap.put(19, state19);

        Map<String, String> state20 = new HashMap<>();
        state20.put("SYM_PLUS", "r5");
        state20.put("SYM_MINUS", "r5");
        state20.put("SYM_VBAR", "r5");
        state20.put("SYM_AMPER", "r5");
        state20.put("SYM_STAR", "s43");
        state20.put("SYM_SLASH", "s44");
        state20.put("OP_EQUALS", "s45");
        state20.put("OP_NOT_EQUALS", "s46");
        state20.put("OP_GREATER", "s47");
        state20.put("OP_LESS", "s48");
        state20.put("SYM_RBRACKET", "r5");
        actionMap.put(20, state20);

        Map<String, String> state21 = new HashMap<>();
        state21.put("SYM_PLUS", "r12");
        state21.put("SYM_MINUS", "r12");
        state21.put("SYM_VBAR", "r12");
        state21.put("SYM_AMPER", "r12");
        state21.put("SYM_STAR", "r12");
        state21.put("SYM_SLASH", "r12");
        state21.put("OP_EQUALS", "r12");
        state21.put("OP_NOT_EQUALS", "r12");
        state21.put("OP_GREATER", "r12");
        state21.put("OP_LESS", "r12");
        state21.put("SYM_RBRACKET", "r12");
        actionMap.put(21, state21);

        Map<String, String> state22 = new HashMap<>();
        state22.put("SYM_PLUS", "r13");
        state22.put("SYM_MINUS", "r13");
        state22.put("SYM_VBAR", "r13");
        state22.put("SYM_AMPER", "r13");
        state22.put("SYM_STAR", "r13");
        state22.put("SYM_SLASH", "r13");
        state22.put("OP_EQUALS", "r13");
        state22.put("OP_NOT_EQUALS", "r13");
        state22.put("OP_GREATER", "r13");
        state22.put("OP_LESS", "r13");
        state22.put("SYM_RBRACKET", "r13");
        actionMap.put(22, state22);

        Map<String, String> state23 = new HashMap<>();
        state23.put("SYM_PLUS", "r14");
        state23.put("SYM_MINUS", "r14");
        state23.put("SYM_VBAR", "r14");
        state23.put("SYM_AMPER", "r14");
        state23.put("SYM_STAR", "r14");
        state23.put("SYM_SLASH", "r14");
        state23.put("OP_EQUALS", "r14");
        state23.put("OP_NOT_EQUALS", "r14");
        state23.put("OP_GREATER", "r14");
        state23.put("OP_LESS", "r14");
        state23.put("SYM_RBRACKET", "r14");
        actionMap.put(23, state23);

        Map<String, String> state24 = new HashMap<>();
        state24.put("KW_TRUE", "s22");
        state24.put("KW_FALSE", "s23");
        state24.put("SYM_LBRACKET", "s24");
        state24.put("LIT_INTEGER", "s25");
        state24.put("KW_FUNC", "s26");
        actionMap.put(24, state24);

        Map<String, String> state25 = new HashMap<>();
        state25.put("SYM_PLUS", "r16");
        state25.put("SYM_MINUS", "r16");
        state25.put("SYM_VBAR", "r16");
        state25.put("SYM_AMPER", "r16");
        state25.put("SYM_STAR", "r16");
        state25.put("SYM_SLASH", "r16");
        state25.put("OP_EQUALS", "r16");
        state25.put("OP_NOT_EQUALS", "r16");
        state25.put("OP_GREATER", "r16");
        state25.put("OP_LESS", "r16");
        state25.put("SYM_RBRACKET", "r16");
        actionMap.put(25, state25);

        Map<String, String> state26 = new HashMap<>();
        state26.put("SYM_LBRACKET", "s50");
        actionMap.put(26, state26);

        Map<String, String> state27 = new HashMap<>();
        state27.put("KW_TRUE", "s55");
        state27.put("KW_FALSE", "s56");
        state27.put("SYM_LBRACKET", "s57");
        state27.put("LIT_INTEGER", "s58");
        state27.put("KW_FUNC", "s59");
        actionMap.put(27, state27);

        Map<String, String> state28 = new HashMap<>();
        state28.put("SYM_PLUS", "r1");
        state28.put("SYM_MINUS", "r1");
        state28.put("SYM_VBAR", "r1");
        state28.put("SYM_AMPER", "r1");
        state28.put("SYM_STAR", "s13");
        state28.put("SYM_SLASH", "s14");
        state28.put("OP_EQUALS", "s15");
        state28.put("OP_NOT_EQUALS", "s16");
        state28.put("OP_GREATER", "s17");
        state28.put("OP_LESS", "s18");
        state28.put("END", "r1");
        actionMap.put(28, state28);

        Map<String, String> state29 = new HashMap<>();
        state29.put("SYM_PLUS", "r2");
        state29.put("SYM_MINUS", "r2");
        state29.put("SYM_VBAR", "r2");
        state29.put("SYM_AMPER", "r2");
        state29.put("SYM_STAR", "s13");
        state29.put("SYM_SLASH", "s14");
        state29.put("OP_EQUALS", "s15");
        state29.put("OP_NOT_EQUALS", "s16");
        state29.put("OP_GREATER", "s17");
        state29.put("OP_LESS", "s18");
        state29.put("END", "r2");
        actionMap.put(29, state29);

        Map<String, String> state30 = new HashMap<>();
        state30.put("SYM_PLUS", "r3");
        state30.put("SYM_MINUS", "r3");
        state30.put("SYM_VBAR", "r3");
        state30.put("SYM_AMPER", "r3");
        state30.put("SYM_STAR", "s13");
        state30.put("SYM_SLASH", "s14");
        state30.put("OP_EQUALS", "s15");
        state30.put("OP_NOT_EQUALS", "s16");
        state30.put("OP_GREATER", "s17");
        state30.put("OP_LESS", "s18");
        state30.put("END", "r3");
        actionMap.put(30, state30);

        Map<String, String> state31 = new HashMap<>();
        state31.put("SYM_PLUS", "r4");
        state31.put("SYM_MINUS", "r4");
        state31.put("SYM_VBAR", "r4");
        state31.put("SYM_AMPER", "r4");
        state31.put("SYM_STAR", "s13");
        state31.put("SYM_SLASH", "s14");
        state31.put("OP_EQUALS", "s15");
        state31.put("OP_NOT_EQUALS", "s16");
        state31.put("OP_GREATER", "s17");
        state31.put("OP_LESS", "s18");
        state31.put("END", "r4");
        actionMap.put(31, state31);

        Map<String, String> state32 = new HashMap<>();
        state32.put("SYM_PLUS", "r6");
        state32.put("SYM_MINUS", "r6");
        state32.put("SYM_VBAR", "r6");
        state32.put("SYM_AMPER", "r6");
        state32.put("SYM_STAR", "r6");
        state32.put("SYM_SLASH", "r6");
        state32.put("OP_EQUALS", "r6");
        state32.put("OP_NOT_EQUALS", "r6");
        state32.put("OP_GREATER", "r6");
        state32.put("OP_LESS", "r6");
        state32.put("END", "r6");
        actionMap.put(32, state32);

        Map<String, String> state33 = new HashMap<>();
        state33.put("SYM_PLUS", "r7");
        state33.put("SYM_MINUS", "r7");
        state33.put("SYM_VBAR", "r7");
        state33.put("SYM_AMPER", "r7");
        state33.put("SYM_STAR", "r7");
        state33.put("SYM_SLASH", "r7");
        state33.put("OP_EQUALS", "r7");
        state33.put("OP_NOT_EQUALS", "r7");
        state33.put("OP_GREATER", "r7");
        state33.put("OP_LESS", "r7");
        state33.put("END", "r7");
        actionMap.put(33, state33);

        Map<String, String> state34 = new HashMap<>();
        state34.put("SYM_PLUS", "r8");
        state34.put("SYM_MINUS", "r8");
        state34.put("SYM_VBAR", "r8");
        state34.put("SYM_AMPER", "r8");
        state34.put("SYM_STAR", "r8");
        state34.put("SYM_SLASH", "r8");
        state34.put("OP_EQUALS", "r8");
        state34.put("OP_NOT_EQUALS", "r8");
        state34.put("OP_GREATER", "r8");
        state34.put("OP_LESS", "r8");
        state34.put("END", "r8");
        actionMap.put(34, state34);

        Map<String, String> state35 = new HashMap<>();
        state35.put("SYM_PLUS", "r9");
        state35.put("SYM_MINUS", "r9");
        state35.put("SYM_VBAR", "r9");
        state35.put("SYM_AMPER", "r9");
        state35.put("SYM_STAR", "r9");
        state35.put("SYM_SLASH", "r9");
        state35.put("OP_EQUALS", "r9");
        state35.put("OP_NOT_EQUALS", "r9");
        state35.put("OP_GREATER", "r9");
        state35.put("OP_LESS", "r9");
        state35.put("END", "r9");
        actionMap.put(35, state35);

        Map<String, String> state36 = new HashMap<>();
        state36.put("SYM_PLUS", "r10");
        state36.put("SYM_MINUS", "r10");
        state36.put("SYM_VBAR", "r10");
        state36.put("SYM_AMPER", "r10");
        state36.put("SYM_STAR", "r10");
        state36.put("SYM_SLASH", "r10");
        state36.put("OP_EQUALS", "r10");
        state36.put("OP_NOT_EQUALS", "r10");
        state36.put("OP_GREATER", "r10");
        state36.put("OP_LESS", "r10");
        state36.put("END", "r10");
        actionMap.put(36, state36);

        Map<String, String> state37 = new HashMap<>();
        state37.put("SYM_PLUS", "r11");
        state37.put("SYM_MINUS", "r11");
        state37.put("SYM_VBAR", "r11");
        state37.put("SYM_AMPER", "r11");
        state37.put("SYM_STAR", "r11");
        state37.put("SYM_SLASH", "r11");
        state37.put("OP_EQUALS", "r11");
        state37.put("OP_NOT_EQUALS", "r11");
        state37.put("OP_GREATER", "r11");
        state37.put("OP_LESS", "r11");
        state37.put("END", "r11");
        actionMap.put(37, state37);

        Map<String, String> state38 = new HashMap<>();
        state38.put("SYM_PLUS", "r15");
        state38.put("SYM_MINUS", "r15");
        state38.put("SYM_VBAR", "r15");
        state38.put("SYM_AMPER", "r15");
        state38.put("SYM_STAR", "r15");
        state38.put("SYM_SLASH", "r15");
        state38.put("OP_EQUALS", "r15");
        state38.put("OP_NOT_EQUALS", "r15");
        state38.put("OP_GREATER", "r15");
        state38.put("OP_LESS", "r15");
        state38.put("END", "r15");
        actionMap.put(38, state38);

        Map<String, String> state39 = new HashMap<>();
        state39.put("KW_TRUE", "s22");
        state39.put("KW_FALSE", "s23");
        state39.put("SYM_LBRACKET", "s24");
        state39.put("LIT_INTEGER", "s25");
        state39.put("KW_FUNC", "s26");
        actionMap.put(39, state39);

        Map<String, String> state40 = new HashMap<>();
        state40.put("KW_TRUE", "s22");
        state40.put("KW_FALSE", "s23");
        state40.put("SYM_LBRACKET", "s24");
        state40.put("LIT_INTEGER", "s25");
        state40.put("KW_FUNC", "s26");
        actionMap.put(40, state40);

        Map<String, String> state41 = new HashMap<>();
        state41.put("KW_TRUE", "s22");
        state41.put("KW_FALSE", "s23");
        state41.put("SYM_LBRACKET", "s24");
        state41.put("LIT_INTEGER", "s25");
        state41.put("KW_FUNC", "s26");
        actionMap.put(41, state41);

        Map<String, String> state42 = new HashMap<>();
        state42.put("KW_TRUE", "s22");
        state42.put("KW_FALSE", "s23");
        state42.put("SYM_LBRACKET", "s24");
        state42.put("LIT_INTEGER", "s25");
        state42.put("KW_FUNC", "s26");
        actionMap.put(42, state42);

        Map<String, String> state43 = new HashMap<>();
        state43.put("KW_TRUE", "s22");
        state43.put("KW_FALSE", "s23");
        state43.put("SYM_LBRACKET", "s24");
        state43.put("LIT_INTEGER", "s25");
        state43.put("KW_FUNC", "s26");
        actionMap.put(43, state43);

        Map<String, String> state44 = new HashMap<>();
        state44.put("KW_TRUE", "s22");
        state44.put("KW_FALSE", "s23");
        state44.put("SYM_LBRACKET", "s24");
        state44.put("LIT_INTEGER", "s25");
        state44.put("KW_FUNC", "s26");
        actionMap.put(44, state44);

        Map<String, String> state45 = new HashMap<>();
        state45.put("KW_TRUE", "s22");
        state45.put("KW_FALSE", "s23");
        state45.put("SYM_LBRACKET", "s24");
        state45.put("LIT_INTEGER", "s25");
        state45.put("KW_FUNC", "s26");
        actionMap.put(45, state45);

        Map<String, String> state46 = new HashMap<>();
        state46.put("KW_TRUE", "s22");
        state46.put("KW_FALSE", "s23");
        state46.put("SYM_LBRACKET", "s24");
        state46.put("LIT_INTEGER", "s25");
        state46.put("KW_FUNC", "s26");
        actionMap.put(46, state46);

        Map<String, String> state47 = new HashMap<>();
        state47.put("KW_TRUE", "s22");
        state47.put("KW_FALSE", "s23");
        state47.put("SYM_LBRACKET", "s24");
        state47.put("LIT_INTEGER", "s25");
        state47.put("KW_FUNC", "s26");
        actionMap.put(47, state47);

        Map<String, String> state48 = new HashMap<>();
        state48.put("KW_TRUE", "s22");
        state48.put("KW_FALSE", "s23");
        state48.put("SYM_LBRACKET", "s24");
        state48.put("LIT_INTEGER", "s25");
        state48.put("KW_FUNC", "s26");
        actionMap.put(48, state48);

        Map<String, String> state49 = new HashMap<>();
        state49.put("SYM_PLUS", "s39");
        state49.put("SYM_MINUS", "s40");
        state49.put("SYM_VBAR", "s41");
        state49.put("SYM_AMPER", "s42");
        state49.put("SYM_RBRACKET", "s70");
        actionMap.put(49, state49);

        Map<String, String> state50 = new HashMap<>();
        state50.put("KW_TRUE", "s55");
        state50.put("KW_FALSE", "s56");
        state50.put("SYM_LBRACKET", "s57");
        state50.put("LIT_INTEGER", "s58");
        state50.put("KW_FUNC", "s59");
        actionMap.put(50, state50);

        Map<String, String> state51 = new HashMap<>();
        state51.put("SYM_RBRACKET", "s72");
        actionMap.put(51, state51);

        Map<String, String> state52 = new HashMap<>();
        state52.put("SYM_PLUS", "s74");
        state52.put("SYM_MINUS", "s75");
        state52.put("SYM_VBAR", "s76");
        state52.put("SYM_AMPER", "s77");
        state52.put("SYM_RBRACKET", "r19");
        state52.put("SYM_COMMA", "s73");
        actionMap.put(52, state52);

        Map<String, String> state53 = new HashMap<>();
        state53.put("SYM_PLUS", "r5");
        state53.put("SYM_MINUS", "r5");
        state53.put("SYM_VBAR", "r5");
        state53.put("SYM_AMPER", "r5");
        state53.put("SYM_STAR", "s78");
        state53.put("SYM_SLASH", "s79");
        state53.put("OP_EQUALS", "s80");
        state53.put("OP_NOT_EQUALS", "s81");
        state53.put("OP_GREATER", "s82");
        state53.put("OP_LESS", "s83");
        state53.put("SYM_RBRACKET", "r5");
        state53.put("SYM_COMMA", "r5");
        actionMap.put(53, state53);

        Map<String, String> state54 = new HashMap<>();
        state54.put("SYM_PLUS", "r12");
        state54.put("SYM_MINUS", "r12");
        state54.put("SYM_VBAR", "r12");
        state54.put("SYM_AMPER", "r12");
        state54.put("SYM_STAR", "r12");
        state54.put("SYM_SLASH", "r12");
        state54.put("OP_EQUALS", "r12");
        state54.put("OP_NOT_EQUALS", "r12");
        state54.put("OP_GREATER", "r12");
        state54.put("OP_LESS", "r12");
        state54.put("SYM_RBRACKET", "r12");
        state54.put("SYM_COMMA", "r12");
        actionMap.put(54, state54);

        Map<String, String> state55 = new HashMap<>();
        state55.put("SYM_PLUS", "r13");
        state55.put("SYM_MINUS", "r13");
        state55.put("SYM_VBAR", "r13");
        state55.put("SYM_AMPER", "r13");
        state55.put("SYM_STAR", "r13");
        state55.put("SYM_SLASH", "r13");
        state55.put("OP_EQUALS", "r13");
        state55.put("OP_NOT_EQUALS", "r13");
        state55.put("OP_GREATER", "r13");
        state55.put("OP_LESS", "r13");
        state55.put("SYM_RBRACKET", "r13");
        state55.put("SYM_COMMA", "r13");
        actionMap.put(55, state55);

        Map<String, String> state56 = new HashMap<>();
        state56.put("SYM_PLUS", "r14");
        state56.put("SYM_MINUS", "r14");
        state56.put("SYM_VBAR", "r14");
        state56.put("SYM_AMPER", "r14");
        state56.put("SYM_STAR", "r14");
        state56.put("SYM_SLASH", "r14");
        state56.put("OP_EQUALS", "r14");
        state56.put("OP_NOT_EQUALS", "r14");
        state56.put("OP_GREATER", "r14");
        state56.put("OP_LESS", "r14");
        state56.put("SYM_RBRACKET", "r14");
        state56.put("SYM_COMMA", "r14");
        actionMap.put(56, state56);

        Map<String, String> state57 = new HashMap<>();
        state57.put("KW_TRUE", "s22");
        state57.put("KW_FALSE", "s23");
        state57.put("SYM_LBRACKET", "s24");
        state57.put("LIT_INTEGER", "s25");
        state57.put("KW_FUNC", "s26");
        actionMap.put(57, state57);

        Map<String, String> state58 = new HashMap<>();
        state58.put("SYM_PLUS", "r16");
        state58.put("SYM_MINUS", "r16");
        state58.put("SYM_VBAR", "r16");
        state58.put("SYM_AMPER", "r16");
        state58.put("SYM_STAR", "r16");
        state58.put("SYM_SLASH", "r16");
        state58.put("OP_EQUALS", "r16");
        state58.put("OP_NOT_EQUALS", "r16");
        state58.put("OP_GREATER", "r16");
        state58.put("OP_LESS", "r16");
        state58.put("SYM_RBRACKET", "r16");
        state58.put("SYM_COMMA", "r16");
        actionMap.put(58, state58);

        Map<String, String> state59 = new HashMap<>();
        state59.put("SYM_LBRACKET", "s85");
        actionMap.put(59, state59);

        Map<String, String> state60 = new HashMap<>();
        state60.put("SYM_PLUS", "r1");
        state60.put("SYM_MINUS", "r1");
        state60.put("SYM_VBAR", "r1");
        state60.put("SYM_AMPER", "r1");
        state60.put("SYM_STAR", "s43");
        state60.put("SYM_SLASH", "s44");
        state60.put("OP_EQUALS", "s45");
        state60.put("OP_NOT_EQUALS", "s46");
        state60.put("OP_GREATER", "s47");
        state60.put("OP_LESS", "s48");
        state60.put("SYM_RBRACKET", "r1");
        actionMap.put(60, state60);

        Map<String, String> state61 = new HashMap<>();
        state61.put("SYM_PLUS", "r2");
        state61.put("SYM_MINUS", "r2");
        state61.put("SYM_VBAR", "r2");
        state61.put("SYM_AMPER", "r2");
        state61.put("SYM_STAR", "s43");
        state61.put("SYM_SLASH", "s44");
        state61.put("OP_EQUALS", "s45");
        state61.put("OP_NOT_EQUALS", "s46");
        state61.put("OP_GREATER", "s47");
        state61.put("OP_LESS", "s48");
        state61.put("SYM_RBRACKET", "r2");
        actionMap.put(61, state61);

        Map<String, String> state62 = new HashMap<>();
        state62.put("SYM_PLUS", "r3");
        state62.put("SYM_MINUS", "r3");
        state62.put("SYM_VBAR", "r3");
        state62.put("SYM_AMPER", "r3");
        state62.put("SYM_STAR", "s43");
        state62.put("SYM_SLASH", "s44");
        state62.put("OP_EQUALS", "s45");
        state62.put("OP_NOT_EQUALS", "s46");
        state62.put("OP_GREATER", "s47");
        state62.put("OP_LESS", "s48");
        state62.put("SYM_RBRACKET", "r3");
        actionMap.put(62, state62);

        Map<String, String> state63 = new HashMap<>();
        state63.put("SYM_PLUS", "r4");
        state63.put("SYM_MINUS", "r4");
        state63.put("SYM_VBAR", "r4");
        state63.put("SYM_AMPER", "r4");
        state63.put("SYM_STAR", "s43");
        state63.put("SYM_SLASH", "s44");
        state63.put("OP_EQUALS", "s45");
        state63.put("OP_NOT_EQUALS", "s46");
        state63.put("OP_GREATER", "s47");
        state63.put("OP_LESS", "s48");
        state63.put("SYM_RBRACKET", "r4");
        actionMap.put(63, state63);

        Map<String, String> state64 = new HashMap<>();
        state64.put("SYM_PLUS", "r6");
        state64.put("SYM_MINUS", "r6");
        state64.put("SYM_VBAR", "r6");
        state64.put("SYM_AMPER", "r6");
        state64.put("SYM_STAR", "r6");
        state64.put("SYM_SLASH", "r6");
        state64.put("OP_EQUALS", "r6");
        state64.put("OP_NOT_EQUALS", "r6");
        state64.put("OP_GREATER", "r6");
        state64.put("OP_LESS", "r6");
        state64.put("SYM_RBRACKET", "r6");
        actionMap.put(64, state64);

        Map<String, String> state65 = new HashMap<>();
        state65.put("SYM_PLUS", "r7");
        state65.put("SYM_MINUS", "r7");
        state65.put("SYM_VBAR", "r7");
        state65.put("SYM_AMPER", "r7");
        state65.put("SYM_STAR", "r7");
        state65.put("SYM_SLASH", "r7");
        state65.put("OP_EQUALS", "r7");
        state65.put("OP_NOT_EQUALS", "r7");
        state65.put("OP_GREATER", "r7");
        state65.put("OP_LESS", "r7");
        state65.put("SYM_RBRACKET", "r7");
        actionMap.put(65, state65);

        Map<String, String> state66 = new HashMap<>();
        state66.put("SYM_PLUS", "r8");
        state66.put("SYM_MINUS", "r8");
        state66.put("SYM_VBAR", "r8");
        state66.put("SYM_AMPER", "r8");
        state66.put("SYM_STAR", "r8");
        state66.put("SYM_SLASH", "r8");
        state66.put("OP_EQUALS", "r8");
        state66.put("OP_NOT_EQUALS", "r8");
        state66.put("OP_GREATER", "r8");
        state66.put("OP_LESS", "r8");
        state66.put("SYM_RBRACKET", "r8");
        actionMap.put(66, state66);

        Map<String, String> state67 = new HashMap<>();
        state67.put("SYM_PLUS", "r9");
        state67.put("SYM_MINUS", "r9");
        state67.put("SYM_VBAR", "r9");
        state67.put("SYM_AMPER", "r9");
        state67.put("SYM_STAR", "r9");
        state67.put("SYM_SLASH", "r9");
        state67.put("OP_EQUALS", "r9");
        state67.put("OP_NOT_EQUALS", "r9");
        state67.put("OP_GREATER", "r9");
        state67.put("OP_LESS", "r9");
        state67.put("SYM_RBRACKET", "r9");
        actionMap.put(67, state67);

        Map<String, String> state68 = new HashMap<>();
        state68.put("SYM_PLUS", "r10");
        state68.put("SYM_MINUS", "r10");
        state68.put("SYM_VBAR", "r10");
        state68.put("SYM_AMPER", "r10");
        state68.put("SYM_STAR", "r10");
        state68.put("SYM_SLASH", "r10");
        state68.put("OP_EQUALS", "r10");
        state68.put("OP_NOT_EQUALS", "r10");
        state68.put("OP_GREATER", "r10");
        state68.put("OP_LESS", "r10");
        state68.put("SYM_RBRACKET", "r10");
        actionMap.put(68, state68);

        Map<String, String> state69 = new HashMap<>();
        state69.put("SYM_PLUS", "r11");
        state69.put("SYM_MINUS", "r11");
        state69.put("SYM_VBAR", "r11");
        state69.put("SYM_AMPER", "r11");
        state69.put("SYM_STAR", "r11");
        state69.put("SYM_SLASH", "r11");
        state69.put("OP_EQUALS", "r11");
        state69.put("OP_NOT_EQUALS", "r11");
        state69.put("OP_GREATER", "r11");
        state69.put("OP_LESS", "r11");
        state69.put("SYM_RBRACKET", "r11");
        actionMap.put(69, state69);

        Map<String, String> state70 = new HashMap<>();
        state70.put("SYM_PLUS", "r15");
        state70.put("SYM_MINUS", "r15");
        state70.put("SYM_VBAR", "r15");
        state70.put("SYM_AMPER", "r15");
        state70.put("SYM_STAR", "r15");
        state70.put("SYM_SLASH", "r15");
        state70.put("OP_EQUALS", "r15");
        state70.put("OP_NOT_EQUALS", "r15");
        state70.put("OP_GREATER", "r15");
        state70.put("OP_LESS", "r15");
        state70.put("SYM_RBRACKET", "r15");
        actionMap.put(70, state70);

        Map<String, String> state71 = new HashMap<>();
        state71.put("SYM_RBRACKET", "s86");
        actionMap.put(71, state71);

        Map<String, String> state72 = new HashMap<>();
        state72.put("SYM_PLUS", "r17");
        state72.put("SYM_MINUS", "r17");
        state72.put("SYM_VBAR", "r17");
        state72.put("SYM_AMPER", "r17");
        state72.put("SYM_STAR", "r17");
        state72.put("SYM_SLASH", "r17");
        state72.put("OP_EQUALS", "r17");
        state72.put("OP_NOT_EQUALS", "r17");
        state72.put("OP_GREATER", "r17");
        state72.put("OP_LESS", "r17");
        state72.put("END", "r17");
        actionMap.put(72, state72);

        Map<String, String> state73 = new HashMap<>();
        state73.put("KW_TRUE", "s55");
        state73.put("KW_FALSE", "s56");
        state73.put("SYM_LBRACKET", "s57");
        state73.put("LIT_INTEGER", "s58");
        state73.put("KW_FUNC", "s59");
        actionMap.put(73, state73);

        Map<String, String> state74 = new HashMap<>();
        state74.put("KW_TRUE", "s55");
        state74.put("KW_FALSE", "s56");
        state74.put("SYM_LBRACKET", "s57");
        state74.put("LIT_INTEGER", "s58");
        state74.put("KW_FUNC", "s59");
        actionMap.put(74, state74);

        Map<String, String> state75 = new HashMap<>();
        state75.put("KW_TRUE", "s55");
        state75.put("KW_FALSE", "s56");
        state75.put("SYM_LBRACKET", "s57");
        state75.put("LIT_INTEGER", "s58");
        state75.put("KW_FUNC", "s59");
        actionMap.put(75, state75);

        Map<String, String> state76 = new HashMap<>();
        state76.put("KW_TRUE", "s55");
        state76.put("KW_FALSE", "s56");
        state76.put("SYM_LBRACKET", "s57");
        state76.put("LIT_INTEGER", "s58");
        state76.put("KW_FUNC", "s59");
        actionMap.put(76, state76);

        Map<String, String> state77 = new HashMap<>();
        state77.put("KW_TRUE", "s55");
        state77.put("KW_FALSE", "s56");
        state77.put("SYM_LBRACKET", "s57");
        state77.put("LIT_INTEGER", "s58");
        state77.put("KW_FUNC", "s59");
        actionMap.put(77, state77);

        Map<String, String> state78 = new HashMap<>();
        state78.put("KW_TRUE", "s55");
        state78.put("KW_FALSE", "s56");
        state78.put("SYM_LBRACKET", "s57");
        state78.put("LIT_INTEGER", "s58");
        state78.put("KW_FUNC", "s59");
        actionMap.put(78, state78);

        Map<String, String> state79 = new HashMap<>();
        state79.put("KW_TRUE", "s55");
        state79.put("KW_FALSE", "s56");
        state79.put("SYM_LBRACKET", "s57");
        state79.put("LIT_INTEGER", "s58");
        state79.put("KW_FUNC", "s59");
        actionMap.put(79, state79);

        Map<String, String> state80 = new HashMap<>();
        state80.put("KW_TRUE", "s55");
        state80.put("KW_FALSE", "s56");
        state80.put("SYM_LBRACKET", "s57");
        state80.put("LIT_INTEGER", "s58");
        state80.put("KW_FUNC", "s59");
        actionMap.put(80, state80);

        Map<String, String> state81 = new HashMap<>();
        state81.put("KW_TRUE", "s55");
        state81.put("KW_FALSE", "s56");
        state81.put("SYM_LBRACKET", "s57");
        state81.put("LIT_INTEGER", "s58");
        state81.put("KW_FUNC", "s59");
        actionMap.put(81, state81);

        Map<String, String> state82 = new HashMap<>();
        state82.put("KW_TRUE", "s55");
        state82.put("KW_FALSE", "s56");
        state82.put("SYM_LBRACKET", "s57");
        state82.put("LIT_INTEGER", "s58");
        state82.put("KW_FUNC", "s59");
        actionMap.put(82, state82);

        Map<String, String> state83 = new HashMap<>();
        state83.put("KW_TRUE", "s55");
        state83.put("KW_FALSE", "s56");
        state83.put("SYM_LBRACKET", "s57");
        state83.put("LIT_INTEGER", "s58");
        state83.put("KW_FUNC", "s59");
        actionMap.put(83, state83);

        Map<String, String> state84 = new HashMap<>();
        state84.put("SYM_PLUS", "s39");
        state84.put("SYM_MINUS", "s40");
        state84.put("SYM_VBAR", "s41");
        state84.put("SYM_AMPER", "s42");
        state84.put("SYM_RBRACKET", "s98");
        actionMap.put(84, state84);

        Map<String, String> state85 = new HashMap<>();
        state85.put("KW_TRUE", "s55");
        state85.put("KW_FALSE", "s56");
        state85.put("SYM_LBRACKET", "s57");
        state85.put("LIT_INTEGER", "s58");
        state85.put("KW_FUNC", "s59");
        actionMap.put(85, state85);

        Map<String, String> state86 = new HashMap<>();
        state86.put("SYM_PLUS", "r17");
        state86.put("SYM_MINUS", "r17");
        state86.put("SYM_VBAR", "r17");
        state86.put("SYM_AMPER", "r17");
        state86.put("SYM_STAR", "r17");
        state86.put("SYM_SLASH", "r17");
        state86.put("OP_EQUALS", "r17");
        state86.put("OP_NOT_EQUALS", "r17");
        state86.put("OP_GREATER", "r17");
        state86.put("OP_LESS", "r17");
        state86.put("SYM_RBRACKET", "r17");
        actionMap.put(86, state86);

        Map<String, String> state87 = new HashMap<>();
        state87.put("SYM_RBRACKET", "r18");
        actionMap.put(87, state87);

        Map<String, String> state88 = new HashMap<>();
        state88.put("SYM_PLUS", "r1");
        state88.put("SYM_MINUS", "r1");
        state88.put("SYM_VBAR", "r1");
        state88.put("SYM_AMPER", "r1");
        state88.put("SYM_STAR", "s78");
        state88.put("SYM_SLASH", "s79");
        state88.put("OP_EQUALS", "s80");
        state88.put("OP_NOT_EQUALS", "s81");
        state88.put("OP_GREATER", "s82");
        state88.put("OP_LESS", "s83");
        state88.put("SYM_RBRACKET", "r1");
        state88.put("SYM_COMMA", "r1");
        actionMap.put(88, state88);

        Map<String, String> state89 = new HashMap<>();
        state89.put("SYM_PLUS", "r2");
        state89.put("SYM_MINUS", "r2");
        state89.put("SYM_VBAR", "r2");
        state89.put("SYM_AMPER", "r2");
        state89.put("SYM_STAR", "s78");
        state89.put("SYM_SLASH", "s79");
        state89.put("OP_EQUALS", "s80");
        state89.put("OP_NOT_EQUALS", "s81");
        state89.put("OP_GREATER", "s82");
        state89.put("OP_LESS", "s83");
        state89.put("SYM_RBRACKET", "r2");
        state89.put("SYM_COMMA", "r2");
        actionMap.put(89, state89);

        Map<String, String> state90 = new HashMap<>();
        state90.put("SYM_PLUS", "r3");
        state90.put("SYM_MINUS", "r3");
        state90.put("SYM_VBAR", "r3");
        state90.put("SYM_AMPER", "r3");
        state90.put("SYM_STAR", "s78");
        state90.put("SYM_SLASH", "s79");
        state90.put("OP_EQUALS", "s80");
        state90.put("OP_NOT_EQUALS", "s81");
        state90.put("OP_GREATER", "s82");
        state90.put("OP_LESS", "s83");
        state90.put("SYM_RBRACKET", "r3");
        state90.put("SYM_COMMA", "r3");
        actionMap.put(90, state90);

        Map<String, String> state91 = new HashMap<>();
        state91.put("SYM_PLUS", "r4");
        state91.put("SYM_MINUS", "r4");
        state91.put("SYM_VBAR", "r4");
        state91.put("SYM_AMPER", "r4");
        state91.put("SYM_STAR", "s78");
        state91.put("SYM_SLASH", "s79");
        state91.put("OP_EQUALS", "s80");
        state91.put("OP_NOT_EQUALS", "s81");
        state91.put("OP_GREATER", "s82");
        state91.put("OP_LESS", "s83");
        state91.put("SYM_RBRACKET", "r4");
        state91.put("SYM_COMMA", "r4");
        actionMap.put(91, state91);

        Map<String, String> state92 = new HashMap<>();
        state92.put("SYM_PLUS", "r6");
        state92.put("SYM_MINUS", "r6");
        state92.put("SYM_VBAR", "r6");
        state92.put("SYM_AMPER", "r6");
        state92.put("SYM_STAR", "r6");
        state92.put("SYM_SLASH", "r6");
        state92.put("OP_EQUALS", "r6");
        state92.put("OP_NOT_EQUALS", "r6");
        state92.put("OP_GREATER", "r6");
        state92.put("OP_LESS", "r6");
        state92.put("SYM_RBRACKET", "r6");
        state92.put("SYM_COMMA", "r6");
        actionMap.put(92, state92);

        Map<String, String> state93 = new HashMap<>();
        state93.put("SYM_PLUS", "r7");
        state93.put("SYM_MINUS", "r7");
        state93.put("SYM_VBAR", "r7");
        state93.put("SYM_AMPER", "r7");
        state93.put("SYM_STAR", "r7");
        state93.put("SYM_SLASH", "r7");
        state93.put("OP_EQUALS", "r7");
        state93.put("OP_NOT_EQUALS", "r7");
        state93.put("OP_GREATER", "r7");
        state93.put("OP_LESS", "r7");
        state93.put("SYM_RBRACKET", "r7");
        state93.put("SYM_COMMA", "r7");
        actionMap.put(93, state93);

        Map<String, String> state94 = new HashMap<>();
        state94.put("SYM_PLUS", "r8");
        state94.put("SYM_MINUS", "r8");
        state94.put("SYM_VBAR", "r8");
        state94.put("SYM_AMPER", "r8");
        state94.put("SYM_STAR", "r8");
        state94.put("SYM_SLASH", "r8");
        state94.put("OP_EQUALS", "r8");
        state94.put("OP_NOT_EQUALS", "r8");
        state94.put("OP_GREATER", "r8");
        state94.put("OP_LESS", "r8");
        state94.put("SYM_RBRACKET", "r8");
        state94.put("SYM_COMMA", "r8");
        actionMap.put(94, state94);

        Map<String, String> state95 = new HashMap<>();
        state95.put("SYM_PLUS", "r9");
        state95.put("SYM_MINUS", "r9");
        state95.put("SYM_VBAR", "r9");
        state95.put("SYM_AMPER", "r9");
        state95.put("SYM_STAR", "r9");
        state95.put("SYM_SLASH", "r9");
        state95.put("OP_EQUALS", "r9");
        state95.put("OP_NOT_EQUALS", "r9");
        state95.put("OP_GREATER", "r9");
        state95.put("OP_LESS", "r9");
        state95.put("SYM_RBRACKET", "r9");
        state95.put("SYM_COMMA", "r9");
        actionMap.put(95, state95);

        Map<String, String> state96 = new HashMap<>();
        state96.put("SYM_PLUS", "r10");
        state96.put("SYM_MINUS", "r10");
        state96.put("SYM_VBAR", "r10");
        state96.put("SYM_AMPER", "r10");
        state96.put("SYM_STAR", "r10");
        state96.put("SYM_SLASH", "r10");
        state96.put("OP_EQUALS", "r10");
        state96.put("OP_NOT_EQUALS", "r10");
        state96.put("OP_GREATER", "r10");
        state96.put("OP_LESS", "r10");
        state96.put("SYM_RBRACKET", "r10");
        state96.put("SYM_COMMA", "r10");
        actionMap.put(96, state96);

        Map<String, String> state97 = new HashMap<>();
        state97.put("SYM_PLUS", "r11");
        state97.put("SYM_MINUS", "r11");
        state97.put("SYM_VBAR", "r11");
        state97.put("SYM_AMPER", "r11");
        state97.put("SYM_STAR", "r11");
        state97.put("SYM_SLASH", "r11");
        state97.put("OP_EQUALS", "r11");
        state97.put("OP_NOT_EQUALS", "r11");
        state97.put("OP_GREATER", "r11");
        state97.put("OP_LESS", "r11");
        state97.put("SYM_RBRACKET", "r11");
        state97.put("SYM_COMMA", "r11");
        actionMap.put(97, state97);

        Map<String, String> state98 = new HashMap<>();
        state98.put("SYM_PLUS", "r15");
        state98.put("SYM_MINUS", "r15");
        state98.put("SYM_VBAR", "r15");
        state98.put("SYM_AMPER", "r15");
        state98.put("SYM_STAR", "r15");
        state98.put("SYM_SLASH", "r15");
        state98.put("OP_EQUALS", "r15");
        state98.put("OP_NOT_EQUALS", "r15");
        state98.put("OP_GREATER", "r15");
        state98.put("OP_LESS", "r15");
        state98.put("SYM_RBRACKET", "r15");
        state98.put("SYM_COMMA", "r15");
        actionMap.put(98, state98);

        Map<String, String> state99 = new HashMap<>();
        state99.put("SYM_RBRACKET", "s100");
        actionMap.put(99, state99);

        Map<String, String> state100 = new HashMap<>();
        state100.put("SYM_PLUS", "r17");
        state100.put("SYM_MINUS", "r17");
        state100.put("SYM_VBAR", "r17");
        state100.put("SYM_AMPER", "r17");
        state100.put("SYM_STAR", "r17");
        state100.put("SYM_SLASH", "r17");
        state100.put("OP_EQUALS", "r17");
        state100.put("OP_NOT_EQUALS", "r17");
        state100.put("OP_GREATER", "r17");
        state100.put("OP_LESS", "r17");
        state100.put("SYM_RBRACKET", "r17");
        state100.put("SYM_COMMA", "r17");
        actionMap.put(100, state100);
    }

    public Map<Integer, Map<String, String>> getActionMap() {
        return actionMap;
    }
}
