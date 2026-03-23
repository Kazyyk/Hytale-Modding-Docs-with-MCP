# CommandSender

Type: interface | Package: com.hypixel.hytale.server.core.command.system | Implements: com.hypixel.hytale.server.core.receiver.IMessageReceiver, com.hypixel.hytale.server.core.permissions.PermissionHolder

public interface CommandSender

Interface combining `IMessageReceiver` and `PermissionHolder`. Adds `getDisplayName()` and `getUuid()` for identifying the entity executing a command.

Known implementors: ConsoleSender, Player

Also in this package: AbbreviationMap, AbbreviationMapBuilder, AbstractCommand, CommandContext, CommandManager, CommandOwner, CommandRegistration, CommandRegistry, CommandUtil, CommandValidationResults, MatchResult, ParseResult, ParserContext, PreOptionalListContext, Tokenizer

Complete API:
  String getDisplayName()
  UUID getUuid()
