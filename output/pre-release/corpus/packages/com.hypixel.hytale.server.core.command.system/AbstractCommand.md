# AbstractCommand

Type: class | Package: com.hypixel.hytale.server.core.command.system

public abstract class AbstractCommand

Base class for the command system. Manages command name, aliases, description, required/optional/flag arguments, subcommands, usage variants, permission generation, argument parsing, and execution dispatch. Subclasses implement `execute(CommandContext)`.

Known subclasses: AbstractAsyncCommand, CommandBase, PresetsCommand, VoiceEnabledCommand, VoiceFullVolumeDistanceCommand, VoiceMaxDistanceCommand, VoiceMutedListCommand, VoiceStatusCommand

Also in this package: AbbreviationMap, AbbreviationMapBuilder, CommandContext, CommandManager, CommandOwner, CommandRegistration, CommandRegistry, CommandSender, CommandUtil, CommandValidationResults, MatchResult, ParseResult, ParserContext, PreOptionalListContext, Tokenizer

Complete API:
  public void setOwner(CommandOwner owner)
  protected boolean canGeneratePermission()
  protected String generatePermissionNode()
  private String generatePermission()
  public List<String> getPermissionGroups()
  protected void setPermissionGroups(String groups)
  protected void setPermissionGroup(GameMode gameMode)
  public Map<String,Set<String>> getPermissionGroupsRecursive()
  public void putRecursivePermissionGroups(Map<String,Set<String>> permissionsByGroup)
  protected void setUnavailableInSingleplayer(boolean unavailableInSingleplayer)
  public void setAllowsExtraArguments(boolean allowsExtraArguments)
  public MatchResult matches(String language, String search, int termDepth)
  private MatchResult matches(String language, String search, int termDepth, int depth)
  public void completeRegistration()
  private void createOptionalArgumentAbbreviationMap()
  private void validateVariantNumberOfRequiredParameters(ParseResult result)
  private void validateDefaultArguments(ParseResult parseResult)
  public void requirePermission(String permission)
  public String getFullyQualifiedName()
  public int countParents()
  public void addAliases(String aliases)
  public void addSubCommand(AbstractCommand command)
  public void addUsageVariant(AbstractCommand command)
  public CompletableFuture<Void> acceptCall(CommandSender sender, ParserContext parserContext, ParseResult parseResult)
  private CompletableFuture<Void> acceptCall0(CommandSender sender, ParserContext parserContext, ParseResult parseResult)
  public boolean hasPermission(CommandSender sender)
  private ObjectBooleanPair<CompletableFuture<Void>> checkForExecutingSubcommands(CommandSender sender, ParserContext parserContext, ParseResult parseResult, int numberOfPreOptionalTokens)
  private void processRequiredArguments(ParserContext parserContext, ParseResult parseResult, CommandContext commandContext)
  private String extractGreedyRawTail(ParserContext parserContext)
  private void processOptionalArguments(ParserContext parserContext, ParseResult parseResult, CommandContext commandContext)
  protected abstract CompletableFuture<Void> execute(CommandContext var1)
  public Message getUsageString(CommandSender sender)
  public Message getUsageShort(CommandSender sender, boolean fullyQualify)
  private R registerRequiredArg(R requiredArgument)
  private R registerOptionalArg(R optionalArgument)
  public RequiredArg<D> withRequiredArg(String name, String description, ArgumentType<D> argType)
  public W withRequiredArg(String name, String description, ArgWrapper<W,D> wrapper)
  public RequiredArg<List<D>> withListRequiredArg(String name, String description, ArgumentType<D> argType)
  public DefaultArg<D> withDefaultArg(String name, String description, ArgumentType<D> argType, D defaultValue, String defaultValueDescription)
  public W withDefaultArg(String name, String description, ArgWrapper<W,D> wrapper, D defaultValue, String defaultValueDescription)
  public DefaultArg<List<D>> withListDefaultArg(String name, String description, ArgumentType<D> argType, List<D> defaultValue, String defaultValueDescription)
  public OptionalArg<D> withOptionalArg(String name, String description, ArgumentType<D> argType)
  public W withOptionalArg(String name, String description, ArgWrapper<W,D> wrapper)
  public OptionalArg<List<D>> withListOptionalArg(String name, String description, ArgumentType<D> argType)
  public FlagArg withFlagArg(String name, String description)
  public boolean isVariant()
  public String getName()
  public Set<String> getAliases()
  public String getDescription()
  public CommandOwner getOwner()
  public String getPermission()
  public Map<String,AbstractCommand> getSubCommands()
  public List<RequiredArg<?>> getRequiredArguments()
  public boolean hasBeenRegistered()

Fields:
public static final HytaleLogger LOGGER
public static final String[] EMPTY_STRING_ARRAY
private static final Message MESSAGE_COMMANDS_HELP_NO_PERMISSIBLE_SUB_COMMAND
private static final Message MESSAGE_COMMANDS_PARSING_ERROR_NO_PERMISSION_FOR_COMMAND
private static final Message MESSAGE_COMMANDS_PARSING_ERROR_ATTEMPTED_UNSAFE
private static final Message MESSAGE_COMMANDS_PARSING_USAGE_REQUIRES_CONFIRMATION
private static final Message MESSAGE_COMMAND_SINGLEPLAYER
static final String CONFIRM_ARG_TAG
private static final String COLOR_STRING_ARG_REQUIRED
private static final String COLOR_STRING_ARG_OPTIONAL
private AbstractCommand parentCommand
private final String name
private final Set<String> aliases
private final String description
private final List<RequiredArg<?>> requiredArguments
private final Map<String,AbstractOptionalArg<?,?>> optionalArguments
private AbbreviationMap<AbstractOptionalArg<?,?>> argumentAbbreviationMap
private final Map<String,AbstractCommand> subCommands
private final Map<String,String> subCommandsAliases
private final Int2ObjectMap<AbstractCommand> variantCommands
private CommandOwner owner
private String permission
private List<String> permissionGroups
private int totalNumRequiredParameters
private final boolean requiresConfirmation
private boolean unavailableInSingleplayer
private boolean allowsExtraArguments
private boolean hasBeenRegistered
private boolean hasGreedyStringArg
