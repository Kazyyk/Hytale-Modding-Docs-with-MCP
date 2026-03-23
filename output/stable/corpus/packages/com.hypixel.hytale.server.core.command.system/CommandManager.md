# CommandManager

Type: class | Package: com.hypixel.hytale.server.core.command.system | Implements: com.hypixel.hytale.server.core.command.system.CommandOwner

public class CommandManager

Singleton that registers all built-in commands, resolves command names and aliases, tokenizes input, and dispatches execution on the common `ForkJoinPool`. Implements `CommandOwner`.

Also in this package: AbbreviationMap, AbbreviationMapBuilder, AbstractCommand, CommandContext, CommandOwner, CommandRegistration, CommandRegistry, CommandSender, CommandUtil, CommandValidationResults, MatchResult, ParseResult, ParserContext, PreOptionalListContext, Tokenizer

Complete API:
  public static CommandManager get()
  public void shutdown()
  public Map<String,AbstractCommand> getCommandRegistration()
  public void registerCommands()
  public Map<String,Set<String>> createVirtualPermissionGroups()
  public void registerSystemCommand(AbstractCommand command)
  public CommandRegistration register(AbstractCommand command)
  public CompletableFuture<Void> handleCommand(PlayerRef playerRef, String command)
  public CompletableFuture<Void> handleCommand(CommandSender commandSender, String commandString)
  private void runCommand(CommandSender commandSender, String commandInput, AbstractCommand abstractCommand, CompletableFuture<Void> future)
  private static boolean isInternalException(Throwable throwable)
  public CompletableFuture<Void> handleCommands(CommandSender sender, Deque<String> commands)
  private CompletableFuture<Void> handleCommands0(CommandSender sender, Deque<String> commands)
  public String getName()

Fields:
private static final HytaleLogger LOGGER
private static CommandManager instance
private final Map<String,AbstractCommand> commandRegistration
private final Map<String,String> aliases
