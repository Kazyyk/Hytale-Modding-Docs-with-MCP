# CommandOwner

Type: interface | Package: com.hypixel.hytale.server.core.command.system

public interface CommandOwner

Marker interface for the entity that owns a command (either `PluginBase` or `CommandManager`). Provides `getName()`.

Known implementors: CommandManager, PluginBase

Also in this package: AbbreviationMap, AbbreviationMapBuilder, AbstractCommand, CommandContext, CommandManager, CommandRegistration, CommandRegistry, CommandSender, CommandUtil, CommandValidationResults, MatchResult, ParseResult, ParserContext, PreOptionalListContext, Tokenizer

Complete API:
  String getName()
