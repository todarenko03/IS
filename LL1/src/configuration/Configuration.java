package configuration;

import command.*;
import index.IIndex;
import index.Index;
import state.IState;
import token.IToken;

import java.util.*;

public class Configuration implements IConfiguration {

    private static final List<Map.Entry<String, String>> tokenPatterns = List.of(
            Map.entry("OP_STAR_ASSIGN", "\\*="),
            Map.entry("OP_MOD_ASSIGN", "%="),
            Map.entry("LIT_INTEGER", "[0-9]+"),
            Map.entry("KW_ELSE", "else"),
            Map.entry("SYM_MOD", "%"),
            Map.entry("SYM_AMPER", "&"),
            Map.entry("SYM_VBAR", "\\|"),
            Map.entry("SYM_SLASH", "/"),
            Map.entry("KW_NOT", "not"),
            Map.entry("EPSILON", "EPS"),
            Map.entry("KW_WHILE", "while"),
            Map.entry("KW_TRUE", "true"),
            Map.entry("SYM_STAR", "\\*"),
            Map.entry("SYM_RSQB", "\\]"),
            Map.entry("SYM_COLON", ":"),
            Map.entry("OP_LESS", "<"),
            Map.entry("OP_EQUALS", "=="),
            Map.entry("OP_MINUS_ASSIGN", "-="),
            Map.entry("OP_NOT_EQUAL", "!="),
            Map.entry("SYM_LBRACKET", "\\("),
            Map.entry("KW_CONTINUE", "continue"),
            Map.entry("KW_RETURN", "return"),
            Map.entry("OP_GREATER", ">"),
            Map.entry("SYM_LBRACE", "\\{"),
            Map.entry("KW_FALSE", "false"),
            Map.entry("KW_OR", "or"),
            Map.entry("OP_GREATER_EQUAL", ">="),
            Map.entry("SYM_PLUS", "\\+"),
            Map.entry("SYM_SEMI", ";"),
            Map.entry("OP_SLASH_ASSIGN", "/="),
            Map.entry("FUNC_NAME", "func_[a-zA-Z_][a-zA-Z0-9_]*"),
            Map.entry("SYM_LSQB", "\\["),
            Map.entry("KW_BREAK", "break"),
            Map.entry("OP_PLUS_ASSIGN", "\\+="),
            Map.entry("OP_LESS_EQUAL", "<="),
            Map.entry("SYM_RBRACE", "\\}"),
            Map.entry("KW_IF", "if"),
            Map.entry("KW_FUNC", "func"),
            Map.entry("SYM_COMMA", ","),
            Map.entry("SYM_MINUS", "-"),
            Map.entry("KW_AND", "and"),
            Map.entry("SYM_RBRACKET", "\\)"),
            Map.entry("VAR_NAME", "[a-zA-Z_][a-zA-Z0-9_]*")
    );


    private final List<List<Integer>> table = List.of(
            List.of(0, 0, 0, 0),
            List.of(0, 0, 0, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 0, 0, 0),
            List.of(0, 0, 0, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 0, 0, 0),
            List.of(0, 0, 0, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 0, 0, 0),
            List.of(0, 0, 0, 0),
            List.of(0, 0, 0, 0),
            List.of(0, 0, 0, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 0, 0, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 0, 0, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 0, 0, 0),
            List.of(0, 0, 0, 0),
            List.of(0, 0, 0, 0),
            List.of(0, 0, 0, 0),
            List.of(0, 0, 0, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 0, 0, 0),
            List.of(0, 0, 0, 0),
            List.of(0, 0, 0, 0),
            List.of(0, 0, 0, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 0, 0, 0),
            List.of(0, 0, 0, 0),
            List.of(0, 0, 0, 0),
            List.of(0, 0, 0, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 0, 0, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 0, 0, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 0, 0, 0),
            List.of(0, 0, 0, 0),
            List.of(0, 0, 0, 0),
            List.of(0, 0, 0, 0),
            List.of(0, 0, 0, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 0, 0, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 0, 0, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 0, 1, 1),
            List.of(0, 0, 1, 0),
            List.of(1, 0, 1, 0),
            List.of(0, 0, 1, 1),
            List.of(0, 0, 1, 0),
            List.of(1, 0, 1, 0),
            List.of(0, 0, 1, 1),
            List.of(0, 0, 1, 0),
            List.of(0, 1, 1, 0),
            List.of(0, 0, 1, 1),
            List.of(0, 0, 1, 0),
            List.of(1, 0, 1, 0),
            List.of(0, 0, 1, 1),
            List.of(0, 0, 1, 0),
            List.of(1, 0, 1, 0),
            List.of(0, 0, 1, 1),
            List.of(0, 0, 1, 0),
            List.of(0, 1, 1, 0),
            List.of(1, 0, 1, 0),
            List.of(0, 0, 1, 1),
            List.of(1, 1, 1, 0),
            List.of(1, 1, 1, 0),
            List.of(1, 1, 1, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 0, 1, 0),
            List.of(1, 1, 1, 0),
            List.of(1, 1, 1, 0),
            List.of(1, 1, 1, 0),
            List.of(1, 1, 1, 0),
            List.of(1, 1, 1, 0),
            List.of(1, 1, 1, 0),
            List.of(1, 1, 1, 0),
            List.of(1, 1, 1, 0),
            List.of(1, 1, 1, 0),
            List.of(1, 1, 1, 0),
            List.of(1, 1, 1, 0),
            List.of(1, 1, 1, 0),
            List.of(1, 1, 1, 0),
            List.of(0, 0, 1, 1),
            List.of(0, 0, 1, 1),
            List.of(0, 0, 1, 0),
            List.of(0, 0, 1, 1),
            List.of(0, 0, 1, 1),
            List.of(0, 0, 1, 0),
            List.of(0, 0, 1, 1),
            List.of(0, 0, 1, 0),
            List.of(1, 0, 1, 0),
            List.of(0, 0, 1, 1),
            List.of(0, 0, 1, 0),
            List.of(1, 0, 1, 0),
            List.of(0, 0, 1, 1),
            List.of(0, 0, 1, 0),
            List.of(1, 0, 1, 0),
            List.of(0, 0, 1, 1),
            List.of(0, 0, 1, 0),
            List.of(0, 1, 1, 0),
            List.of(0, 0, 1, 1),
            List.of(1, 0, 1, 0),
            List.of(0, 0, 1, 0),
            List.of(1, 0, 1, 0),
            List.of(1, 0, 1, 0),
            List.of(1, 0, 1, 0),
            List.of(0, 0, 1, 1),
            List.of(1, 1, 1, 0),
            List.of(1, 0, 1, 0),
            List.of(1, 0, 1, 0),
            List.of(0, 0, 1, 1),
            List.of(1, 1, 1, 0),
            List.of(1, 0, 1, 0),
            List.of(0, 0, 1, 0),
            List.of(1, 0, 1, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 1, 1, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 0, 1, 1),
            List.of(0, 0, 1, 0),
            List.of(0, 1, 1, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 0, 1, 0),
            List.of(1, 1, 1, 0),
            List.of(1, 1, 1, 0),
            List.of(1, 0, 1, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 1, 1, 0),
            List.of(1, 0, 1, 0),
            List.of(0, 0, 1, 1),
            List.of(1, 0, 1, 0),
            List.of(0, 0, 1, 1),
            List.of(0, 0, 1, 0),
            List.of(1, 0, 1, 0),
            List.of(1, 0, 1, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 1, 1, 0),
            List.of(1, 0, 1, 1),
            List.of(0, 0, 1, 0),
            List.of(1, 0, 1, 0),
            List.of(0, 0, 1, 0),
            List.of(0, 0, 1, 0)
    );


    private final List<Integer> transitions = List.of(
            60,
            61,
            62,
            63,
            65,
            68,
            71,
            72,
            74,
            77,
            80,
            81,
            84,
            85,
            86,
            87,
            88,
            89,
            90,
            91,
            92,
            93,
            94,
            95,
            96,
            97,
            98,
            99,
            100,
            101,
            102,
            103,
            106,
            109,
            111,
            114,
            117,
            120,
            121,
            124,
            129,
            133,
            135,
            137,
            138,
            139,
            141,
            142,
            143,
            144,
            145,
            146,
            147,
            148,
            150,
            151,
            156,
            159,
            160,
            164,
            3,
            45,
            38,
            7,
            4,
            66,
            7,
            4,
            69,
            7,
            4,
            -1,
            11,
            8,
            75,
            11,
            8,
            78,
            11,
            8,
            -1,
            82,
            16,
            -1,
            -1,
            -1,
            18,
            40,
            3,
            0,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            -1,
            11,
            20,
            7,
            11,
            26,
            7,
            11,
            35,
            112,
            7,
            35,
            115,
            7,
            35,
            118,
            7,
            35,
            -1,
            39,
            123,
            44,
            125,
            126,
            127,
            41,
            -1,
            130,
            131,
            41,
            -1,
            134,
            42,
            136,
            41,
            -1,
            45,
            47,
            45,
            -1,
            53,
            55,
            58,
            59,
            -1,
            -1,
            149,
            3,
            -1,
            152,
            3,
            154,
            45,
            56,
            157,
            158,
            45,
            -1,
            161,
            3,
            163,
            45,
            3
    );



    private List<List<String>> guidingSymbols = new ArrayList<>(
            Arrays.asList(
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE", "SYM_RBRACKET", "KW_RETURN", "KW_IF", "KW_WHILE", "KW_BREAK", "KW_CONTINUE"),
                    Arrays.asList("KW_FUNC"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE"),
                    Arrays.asList("SYM_PLUS"),
                    Arrays.asList("SYM_MINUS"),
                    Arrays.asList("SYM_RBRACKET"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE"),
                    Arrays.asList("SYM_STAR"),
                    Arrays.asList("SYM_SLASH"),
                    Arrays.asList("SYM_PLUS", "SYM_MINUS", "SYM_RBRACKET"),
                    Arrays.asList("SYM_LBRACKET"),
                    Arrays.asList("VAR_NAME"),
                    Arrays.asList("LIT_INTEGER"),
                    Arrays.asList("KW_TRUE", "KW_FALSE"),
                    Arrays.asList("VAR_NAME"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE", "SYM_RBRACKET", "KW_RETURN", "KW_IF", "KW_WHILE", "KW_BREAK", "KW_CONTINUE", "KW_FUNC"),
                    Arrays.asList("KW_TRUE"),
                    Arrays.asList("KW_FALSE"),
                    Arrays.asList("OP_EQUALS"),
                    Arrays.asList("OP_NOT_EQUAL"),
                    Arrays.asList("OP_LESS"),
                    Arrays.asList("OP_GREATER"),
                    Arrays.asList("OP_LESS_EQUAL"),
                    Arrays.asList("OP_GREATER_EQUAL"),
                    Arrays.asList("OP_PLUS_ASSIGN"),
                    Arrays.asList("OP_MINUS_ASSIGN"),
                    Arrays.asList("OP_STAR_ASSIGN"),
                    Arrays.asList("OP_SLASH_ASSIGN"),
                    Arrays.asList("OP_MOD_ASSIGN"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE"),
                    Arrays.asList("KW_NOT"),
                    Arrays.asList("KW_AND"),
                    Arrays.asList("KW_OR"),
                    Arrays.asList("SYM_RBRACKET"),
                    Arrays.asList("KW_FUNC"),
                    Arrays.asList("KW_FUNC"),
                    Arrays.asList("VAR_NAME"),
                    Arrays.asList("VAR_NAME"),
                    Arrays.asList("SYM_COMMA"),
                    Arrays.asList("SYM_RBRACKET"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE", "SYM_RBRACKET", "KW_RETURN", "KW_IF", "KW_WHILE", "KW_BREAK", "KW_CONTINUE"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE", "KW_RETURN", "KW_IF", "KW_WHILE", "KW_BREAK", "KW_CONTINUE"),
                    Arrays.asList("SYM_RBRACKET"),
                    Arrays.asList("KW_RETURN"),
                    Arrays.asList("KW_IF"),
                    Arrays.asList("KW_WHILE"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE"),
                    Arrays.asList("KW_BREAK"),
                    Arrays.asList("KW_CONTINUE"),
                    Arrays.asList("KW_RETURN"),
                    Arrays.asList("SYM_EMPTY"),
                    Arrays.asList("KW_IF"),
                    Arrays.asList("KW_ELSE"),
                    Arrays.asList("SYM_EMPTY"),
                    Arrays.asList("KW_WHILE"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE", "SYM_RBRACKET", "KW_RETURN", "KW_IF", "KW_WHILE", "KW_BREAK", "KW_CONTINUE"),
                    Arrays.asList("KW_FUNC"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE"),
                    Arrays.asList("SYM_PLUS", "SYM_MINUS", "SYM_RBRACKET"),
                    Arrays.asList("SYM_PLUS"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE"),
                    Arrays.asList("SYM_PLUS", "SYM_MINUS", "SYM_RBRACKET"),
                    Arrays.asList("SYM_MINUS"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE"),
                    Arrays.asList("SYM_PLUS", "SYM_MINUS", "SYM_RBRACKET"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE"),
                    Arrays.asList("SYM_STAR", "SYM_SLASH", "SYM_PLUS", "SYM_MINUS", "SYM_RBRACKET"),
                    Arrays.asList("SYM_STAR"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE"),
                    Arrays.asList("SYM_STAR", "SYM_SLASH", "SYM_PLUS", "SYM_MINUS", "SYM_RBRACKET"),
                    Arrays.asList("SYM_SLASH"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE"),
                    Arrays.asList("SYM_STAR", "SYM_SLASH", "SYM_PLUS", "SYM_MINUS", "SYM_RBRACKET"),
                    Arrays.asList("SYM_PLUS", "SYM_MINUS", "SYM_RBRACKET"),
                    Arrays.asList("SYM_LBRACKET"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE", "SYM_RBRACKET", "KW_RETURN", "KW_IF", "KW_WHILE", "KW_BREAK", "KW_CONTINUE", "KW_FUNC"),
                    Arrays.asList("SYM_RBRACKET"),
                    Arrays.asList("VAR_NAME"),
                    Arrays.asList("LIT_INTEGER"),
                    Arrays.asList("KW_TRUE", "KW_FALSE"),
                    Arrays.asList("VAR_NAME"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE", "SYM_RBRACKET", "KW_RETURN", "KW_IF", "KW_WHILE", "KW_BREAK", "KW_CONTINUE", "KW_FUNC"),
                    Arrays.asList("KW_TRUE"),
                    Arrays.asList("KW_FALSE"),
                    Arrays.asList("OP_EQUALS"),
                    Arrays.asList("OP_NOT_EQUAL"),
                    Arrays.asList("OP_LESS"),
                    Arrays.asList("OP_GREATER"),
                    Arrays.asList("OP_LESS_EQUAL"),
                    Arrays.asList("OP_GREATER_EQUAL"),
                    Arrays.asList("OP_PLUS_ASSIGN"),
                    Arrays.asList("OP_MINUS_ASSIGN"),
                    Arrays.asList("OP_STAR_ASSIGN"),
                    Arrays.asList("OP_SLASH_ASSIGN"),
                    Arrays.asList("OP_MOD_ASSIGN"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE"),
                    Arrays.asList("OP_EQUALS", "OP_NOT_EQUAL", "OP_LESS", "OP_GREATER", "OP_LESS_EQUAL", "OP_GREATER_EQUAL"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE", "OP_PLUS_ASSIGN", "OP_MINUS_ASSIGN", "OP_STAR_ASSIGN", "OP_SLASH_ASSIGN", "OP_MOD_ASSIGN"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE"),
                    Arrays.asList("KW_AND", "KW_OR", "SYM_RBRACKET"),
                    Arrays.asList("KW_NOT"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE"),
                    Arrays.asList("KW_AND", "KW_OR", "SYM_RBRACKET"),
                    Arrays.asList("KW_AND"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE"),
                    Arrays.asList("KW_AND", "KW_OR", "SYM_RBRACKET"),
                    Arrays.asList("KW_OR"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE"),
                    Arrays.asList("KW_AND", "KW_OR", "SYM_RBRACKET"),
                    Arrays.asList("SYM_RBRACKET"),
                    Arrays.asList("KW_FUNC"),
                    Arrays.asList("SYM_COLON"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE", "SYM_RBRACKET", "KW_RETURN", "KW_IF", "KW_WHILE", "KW_BREAK", "KW_CONTINUE"),
                    Arrays.asList("KW_FUNC"),
                    Arrays.asList("VAR_NAME"),
                    Arrays.asList("SYM_LBRACKET"),
                    Arrays.asList("VAR_NAME"),
                    Arrays.asList("SYM_RBRACKET"),
                    Arrays.asList("VAR_NAME"),
                    Arrays.asList("SYM_LBRACKET"),
                    Arrays.asList("VAR_NAME"),
                    Arrays.asList("SYM_RBRACKET"),
                    Arrays.asList("VAR_NAME"),
                    Arrays.asList("SYM_COMMA", "SYM_RBRACKET"),
                    Arrays.asList("SYM_COMMA"),
                    Arrays.asList("VAR_NAME"),
                    Arrays.asList("SYM_RBRACKET"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE", "SYM_RBRACKET", "KW_RETURN", "KW_IF", "KW_WHILE", "KW_BREAK", "KW_CONTINUE"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE", "KW_RETURN", "KW_IF", "KW_WHILE", "KW_BREAK", "KW_CONTINUE"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE", "SYM_RBRACKET", "KW_RETURN", "KW_IF", "KW_WHILE", "KW_BREAK", "KW_CONTINUE"),
                    Arrays.asList("SYM_RBRACKET"),
                    Arrays.asList("KW_RETURN"),
                    Arrays.asList("KW_IF"),
                    Arrays.asList("KW_WHILE"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE"),
                    Arrays.asList("KW_BREAK"),
                    Arrays.asList("KW_CONTINUE"),
                    Arrays.asList("KW_RETURN"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE"),
                    Arrays.asList("SYM_EMPTY"),
                    Arrays.asList("KW_IF"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE"),
                    Arrays.asList("SYM_COLON"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE", "SYM_RBRACKET", "KW_RETURN", "KW_IF", "KW_WHILE", "KW_BREAK", "KW_CONTINUE"),
                    Arrays.asList("KW_ELSE"),
                    Arrays.asList("KW_ELSE"),
                    Arrays.asList("SYM_COLON"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE", "SYM_RBRACKET", "KW_RETURN", "KW_IF", "KW_WHILE", "KW_BREAK", "KW_CONTINUE"),
                    Arrays.asList("SYM_EMPTY"),
                    Arrays.asList("KW_WHILE"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE"),
                    Arrays.asList("SYM_COLON"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE", "SYM_RBRACKET", "KW_RETURN", "KW_IF", "KW_WHILE", "KW_BREAK", "KW_CONTINUE"),
                    Arrays.asList("SYM_LBRACKET", "VAR_NAME", "LIT_INTEGER", "KW_TRUE", "KW_FALSE")
            )
    );


    public List<List<Integer>> getTable() {
        return table;
    }

    public List<Integer> getTransitions() {
        return transitions;
    }

    public List<Map.Entry<String, String>> getTokensDict() {
        return tokenPatterns;
    }

    public List<List<String>> getGuidingSymbols() {
        return guidingSymbols;
    }

    public Map<List<Integer>, ICommand> initCommandMap(IState state, IToken token, List<String> tokenNames) {
        Map<List<Integer>, ICommand> commandMap = new HashMap<>();
        List<Integer> stack = new ArrayList<>();
        IIndex index = new Index();

        commandMap.put(new ArrayList<Integer>(Arrays.asList(1, 0, 1, 0)), new NextAcceptErrorCommand(token, state, stack, tokenNames, guidingSymbols, transitions, index));
        commandMap.put(new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0)), new NextCommand(token, state, stack, tokenNames, guidingSymbols, transitions, index));
        commandMap.put(new ArrayList<Integer>(Arrays.asList(0, 0, 1, 0)), new NextErrorCommand(token, state, stack, tokenNames, guidingSymbols, transitions, index));
        commandMap.put(new ArrayList<Integer>(Arrays.asList(0, 0, 1, 1)), new NextStackErrorCommand(token, state, stack, tokenNames, guidingSymbols, transitions, index));
        commandMap.put(new ArrayList<Integer>(Arrays.asList(1, 1, 0, 0)), new ReturnAcceptCommand(token, state, stack, tokenNames, guidingSymbols, transitions, index));
        commandMap.put(new ArrayList<Integer>(Arrays.asList(1, 1, 1, 0)), new ReturnAcceptErrorCommand(token, state, stack, tokenNames, guidingSymbols, transitions, index));
        commandMap.put(new ArrayList<Integer>(Arrays.asList(0, 1, 1, 0)), new ReturnErrorCommand(token, state, stack, tokenNames, guidingSymbols, transitions, index));

        return commandMap;
    }
}
