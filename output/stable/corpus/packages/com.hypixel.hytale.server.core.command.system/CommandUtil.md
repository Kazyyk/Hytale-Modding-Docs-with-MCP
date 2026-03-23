# CommandUtil

Type: class | Package: com.hypixel.hytale.server.core.command.system

public class CommandUtil

Static utility methods for command processing: stripping command name from input, requiring permissions.

Also in this package: AbbreviationMap, AbbreviationMapBuilder, AbstractCommand, CommandContext, CommandManager, CommandOwner, CommandRegistration, CommandRegistry, CommandSender, CommandValidationResults, MatchResult, ParseResult, ParserContext, PreOptionalListContext, Tokenizer

Complete API:
  public static String stripCommandName(String rawCommand)
  public static void requirePermission(PermissionHolder permissionHolder, String permission)

Fields:
public static final String CONFIRM_UNSAFE_COMMAND
public static final String WORLD_OPTION
public static final String ENTITY_OPTION
public static final String PLAYER_OPTION
public static int RECOMMEND_COUNT
