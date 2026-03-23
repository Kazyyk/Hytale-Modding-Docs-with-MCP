# MatchResult

Type: class | Package: com.hypixel.hytale.server.core.command.system | Implements: java.lang.Comparable

public class MatchResult

Comparable result from fuzzy-matching a search term against command names, aliases, arguments, and descriptions. Used by the help/search system to rank command relevance. Implements `Comparable<MatchResult>`.

Also in this package: AbbreviationMap, AbbreviationMapBuilder, AbstractCommand, CommandContext, CommandManager, CommandOwner, CommandRegistration, CommandRegistry, CommandSender, CommandUtil, CommandValidationResults, ParseResult, ParserContext, PreOptionalListContext, Tokenizer

Complete API:
  public static MatchResult of(int termDepth, int depth, int type, String text, String search)
  public int getDepth()
  public int getType()
  public int getMatch()
  public MatchResult min(MatchResult other)
  public int compareTo(MatchResult o)
  public boolean equals(Object o)
  public int hashCode()
  public String toString()

Fields:
public static final MatchResult NONE
public static final MatchResult EXACT
public static final int NAME
public static final int ALIAS
public static final int USAGE_ARG
public static final int DESCRIPTION
public static final int USAGE_DESCRIPTION
private final int term
private final int depth
private final int type
private final int match
