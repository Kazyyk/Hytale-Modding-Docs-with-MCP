# Tokenizer

Type: class | Package: com.hypixel.hytale.server.core.command.system

public class Tokenizer

Splits raw command input into tokens, handling quoted strings, escape sequences, and list delimiters (`[`, `]`, `,`).

Also in this package: AbbreviationMap, AbbreviationMapBuilder, AbstractCommand, CommandContext, CommandManager, CommandOwner, CommandRegistration, CommandRegistry, CommandSender, CommandUtil, CommandValidationResults, MatchResult, ParseResult, ParserContext, PreOptionalListContext

Complete API:
  public static List<String> parseArguments(String input, ParseResult parseResult)

Fields:
public static final char MULTI_ARG_SEPARATOR_CHAR
public static final char MULTI_ARG_BEGIN_CHAR
public static final char MULTI_ARG_END_CHAR
public static final String MULTI_ARG_SEPARATOR
public static final String MULTI_ARG_BEGIN
public static final String MULTI_ARG_END
private static final Message MESSAGE_COMMANDS_PARSING_ERROR_UNBALANCED_QUOTES
