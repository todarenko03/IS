package org.example.configuration;

import java.util.List;
import java.util.Map;

public class TokenConfiguration {
    private static final List<Map.Entry<String, String>> tokenPatterns = List.of(
            Map.entry("LIT_INTEGER", "[0-9]+"),
            Map.entry("SYM_AMPER", "&&"),
            Map.entry("SYM_VBAR", "\\|\\|"),
            Map.entry("SYM_SLASH", "/"),
            Map.entry("KW_TRUE", "true"),
            Map.entry("SYM_STAR", "\\*"),
            Map.entry("OP_LESS", "<"),
            Map.entry("OP_EQUALS", "=="),
            Map.entry("OP_NOT_EQUAL", "\\!="),
            Map.entry("SYM_LBRACKET", "\\("),
            Map.entry("OP_GREATER", ">"),
            Map.entry("KW_FALSE", "false"),
            Map.entry("OP_GREATER", ">="),
            Map.entry("SYM_PLUS", "\\+"),
            Map.entry("FUNC_NAME", "func_[a-zA-Z_][a-zA-Z0-9_]*"),
            Map.entry("OP_LESS", "<="),
            Map.entry("KW_FUNC", "func"),
            Map.entry("SYM_COMMA", ","),
            Map.entry("SYM_MINUS", "-"),
            Map.entry("SYM_RBRACKET", "\\)"),
            Map.entry("VAR_NAME", "[a-zA-Z_][a-zA-Z0-9_]*"),
            Map.entry("END", "$")
    );

    public List<Map.Entry<String, String>> getTokensDict() {
        return tokenPatterns;
    }
}
