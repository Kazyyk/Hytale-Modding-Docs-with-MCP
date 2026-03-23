# UpdateDownloadCommand

Type: class | Package: com.hypixel.hytale.server.core.update.command

public class UpdateDownloadCommand

Command to download an available server update.

Also in this package: SetPatchlineVariant, UpdateApplyCommand, UpdateCancelCommand, UpdateCheckCommand, UpdateCommand, UpdatePatchlineCommand, UpdateSetupCommand, UpdateStatusCommand

Complete API:
  protected CompletableFuture<Void> executeAsync(CommandContext context)

Fields:
private static final Message MSG_NOT_AUTHENTICATED
private static final Message MSG_CHECK_FAILED
private static final Message MSG_NO_UPDATE
private static final Message MSG_DOWNLOAD_FAILED
private static final Message MSG_DOWNLOAD_COMPLETE
private static final Message MSG_DOWNLOAD_IN_PROGRESS
private static final Message MSG_INVALID_LAYOUT
private final FlagArg forceFlag
