# AbbreviationMap

Type: class | Package: com.hypixel.hytale.server.core.command.system

public class AbbreviationMap

Utility for prefix-based abbreviation matching of string keys to values. Used internally for optional argument name resolution. Builds an immutable lookup from full keys and all unique prefixes.

Also in this package: AbbreviationMapBuilder, AbstractCommand, CommandContext, CommandManager, CommandOwner, CommandRegistration, CommandRegistry, CommandSender, CommandUtil, CommandValidationResults, MatchResult, ParseResult, ParserContext, PreOptionalListContext, Tokenizer

Complete API:
  public Value get(String input)
  public static AbbreviationMap.AbbreviationMapBuilder<V> create()

Fields:
private final List<Pair<String,Value>> entries
