# CommandValidationResults

Type: class | Package: com.hypixel.hytale.server.core.command.system | Extends: com.hypixel.hytale.codec.validation.ValidationResults

public class CommandValidationResults

Extends `ValidationResults` to bridge codec validation into the command `ParseResult` system. Collects validation exceptions and fails the parse result if any are errors.

Also in this package: AbbreviationMap, AbbreviationMapBuilder, AbstractCommand, CommandContext, CommandManager, CommandOwner, CommandRegistration, CommandRegistry, CommandSender, CommandUtil, MatchResult, ParseResult, ParserContext, PreOptionalListContext, Tokenizer

Complete API:
  public void processResults(ParseResult parseResult)
