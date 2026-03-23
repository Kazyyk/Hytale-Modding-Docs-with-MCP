# ParseResult

Type: class | Package: com.hypixel.hytale.server.core.command.system

public class ParseResult

Accumulates failure messages during command parsing. Optionally throws `GeneralCommandException` on failure when constructed in validation mode.

Also in this package: AbbreviationMap, AbbreviationMapBuilder, AbstractCommand, CommandContext, CommandManager, CommandOwner, CommandRegistration, CommandRegistry, CommandSender, CommandUtil, CommandValidationResults, MatchResult, ParserContext, PreOptionalListContext, Tokenizer

Complete API:
  public void fail(Message reason, Message otherMessages)
  public void fail(Message reason)
  public boolean failed()
  public void sendMessages(CommandSender sender)

Fields:
private boolean failed
private List<Message> reasons
private final boolean throwExceptionWhenFailed
