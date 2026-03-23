# CommandRegistry

Type: class | Package: com.hypixel.hytale.server.core.command.system | Extends: com.hypixel.hytale.registry.Registry

public class CommandRegistry

Plugin-scoped command registry that delegates to `CommandManager.register()` and tracks registrations with enable/disable lifecycle.

Also in this package: AbbreviationMap, AbbreviationMapBuilder, AbstractCommand, CommandContext, CommandManager, CommandOwner, CommandRegistration, CommandSender, CommandUtil, CommandValidationResults, MatchResult, ParseResult, ParserContext, PreOptionalListContext, Tokenizer

Complete API:
  public CommandRegistration registerCommand(AbstractCommand command)

Fields:
private final PluginBase plugin
