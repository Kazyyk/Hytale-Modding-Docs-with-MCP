# ParserContext

Type: class | Package: com.hypixel.hytale.server.core.command.system

public class ParserContext

Contextualizes tokenized command input into pre-optional single-value tokens, list tokens, and optional argument maps. Handles subcommand index advancement and special token parsing (brackets, commas).

Also in this package: AbbreviationMap, AbbreviationMapBuilder, AbstractCommand, CommandContext, CommandManager, CommandOwner, CommandRegistration, CommandRegistry, CommandSender, CommandUtil, CommandValidationResults, MatchResult, ParseResult, PreOptionalListContext, Tokenizer

Complete API:
  public static ParserContext of(List<String> tokens, String rawInput, ParseResult parseResult)
  private void contextualizeTokens(List<String> tokens, ParseResult parseResult)
  public void addNewOptionalArg(String name)
  public void appendOptionalParameter(String value, ParseResult parseResult)
  public String getInputString()
  public String getRawInput()
  public int getSubCommandIndex()
  public boolean isListToken(int index)
  public int getNumPreOptSingleValueTokensBeforeListTokens()
  public int getNumPreOptionalTokens()
  public String getPreOptionalSingleValueToken(int index)
  public ParserContext.PreOptionalListContext getPreOptionalListToken(int index)
  public String getFirstToken()
  public ObjectSortedSet<Entry<String,List<List<String>>>> getOptionalArgs()
  public boolean isHelpSpecified()
  public boolean isConfirmationSpecified()
  public void convertToSubCommand()

Fields:
private static final HashSet<String> SPECIAL_TOKENS
private static final int MAX_LIST_ITEMS
private final String inputString
private final String rawInput
private final BooleanArrayList parameterForwardingMap
private final Int2ObjectMap<String> preOptionalSingleValueTokens
private final Int2ObjectMap<ParserContext.PreOptionalListContext> preOptionalListTokens
private final Object2ObjectLinkedOpenHashMap<String,List<List<String>>> optionalArgs
private String lastInsertedOptionalArgName
private int numPreOptSingleValueTokensBeforeListTokens
private int subCommandIndex
private static final Pattern ARG_NAME_PATTERN
private static final Pattern ARG_NAME_AND_VALUE_PATTERN
