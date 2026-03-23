# CommandContext

Type: class | Package: com.hypixel.hytale.server.core.command.system

public class CommandContext

Holds the parsed argument values, input string, and sender reference for a single command invocation. Provides typed accessors `get(Argument)`, `provided(Argument)`, sender casting via `senderAs(Class)`, and convenience methods like `isPlayer()` and `senderAsPlayerRef()`.

Also in this package: AbbreviationMap, AbbreviationMapBuilder, AbstractCommand, CommandManager, CommandOwner, CommandRegistration, CommandRegistry, CommandSender, CommandUtil, CommandValidationResults, MatchResult, ParseResult, ParserContext, PreOptionalListContext, Tokenizer

Complete API:
  void appendArgumentData(Argument<?,DataType> argument, String[] data, boolean asListArgument, ParseResult parseResult)
  public DataType get(Argument<?,DataType> argument)
  public String[] getInput(Argument<?,?> argument)
  public boolean provided(Argument<?,?> argument)
  public String getInputString()
  public void sendMessage(Message message)
  public boolean isPlayer()
  public T senderAs(Class<T> senderType)
  public Ref<EntityStore> senderAsPlayerRef()
  public CommandSender sender()
  public AbstractCommand getCalledCommand()

Fields:
private final AbstractCommand calledCommand
private final String inputString
private final CommandSender sender
private final Map<Argument<?,?>,Object> argValues
private final Map<Argument<?,?>,String[]> argInput
