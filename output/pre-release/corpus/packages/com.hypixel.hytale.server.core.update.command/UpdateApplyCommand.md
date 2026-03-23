# UpdateApplyCommand

Type: class | Package: com.hypixel.hytale.server.core.update.command

public class UpdateApplyCommand

Command to apply a downloaded server update.

Also in this package: SetPatchlineVariant, UpdateCancelCommand, UpdateCheckCommand, UpdateCommand, UpdateDownloadCommand, UpdatePatchlineCommand, UpdateSetupCommand, UpdateStatusCommand

Complete API:
  protected void executeSync(CommandContext context)
  private void backupCurrentFiles()
  private void backupConfigFiles()

Fields:
private static final HytaleLogger LOGGER
private static final Message MSG_NO_STAGED
private static final Message MSG_BACKUP_FAILED
private final FlagArg confirmFlag
private static final String[] CONFIG_FILES
