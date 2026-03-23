# EventTitleCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.utility | Extends: CommandBase

public class EventTitleCommand extends CommandBase

## Methods

- public EventTitleCommand()
- protected void executeSync(@Nonnull CommandContext context)
- private String extractTitleFromRawInput(@Nonnull String rawArgs, @Nonnull CommandContext context)

Also in this package: BackupCommand, ConvertPrefabsCommand, NotifyCommand, StashCommand, UIGalleryCommand, ValidateCPBCommand

Complete API:
  protected void executeSync(CommandContext context)
  private String extractTitleFromRawInput(String rawArgs, CommandContext context)

Fields:
private static final Message MESSAGE_COMMANDS_EVENT_TITLE_TITLE_REQUIRED
private final FlagArg majorFlag
private final DefaultArg<String> secondaryTitleArg
private final OptionalArg<String> primaryTitleArg
