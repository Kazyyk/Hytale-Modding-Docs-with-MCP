# UpdateSetupCommand

Type: class | Package: com.hypixel.hytale.server.core.update.command | Extends: CommandBase

public class UpdateSetupCommand extends CommandBase

Server command that extracts wrapper startup scripts (`start.sh` and `start.bat`) from the server JAR to the parent directory. Validates that the server is running from a JAR, optionally checks that the working directory is named `"Server"`, and supports a `--force` flag to overwrite existing scripts.

## Constructor


public UpdateSetupCommand()

Registers as `"setup"` with description key `"server.commands.update.setup.desc"`.

## Fields

- forceFlag | FlagArg | Optional `--force` flag to bypass directory name and overwrite checks.

## Key Methods

- executeSync(CommandContext) | void | Validates preconditions, extracts `start.sh` and `start.bat`, sets executable permission on Unix, warns if `Assets.zip` is missing.

## Validation Order

1. Checks `ManifestUtil.isJar()` -- rejects if not running from a JAR.
2. Checks working directory name equals `"Server"` (skipped with `--force`).
3. Checks if `start.sh` or `start.bat` already exist (skipped with `--force`).

Also in this package: SetPatchlineVariant, UpdateApplyCommand, UpdateCancelCommand, UpdateCheckCommand, UpdateCommand, UpdateDownloadCommand, UpdatePatchlineCommand, UpdateStatusCommand

Complete API:
  protected void executeSync(CommandContext context)
  private void extractResource(String resourcePath, Path target)

Fields:
private static final HytaleLogger LOGGER
private static final String RESOURCE_START_SH
private static final String RESOURCE_START_BAT
private static final String EXPECTED_DIR_NAME
private static final Message MSG_NOT_JAR
private static final Message MSG_INVALID_DIRECTORY
private static final Message MSG_ALREADY_EXIST
private static final Message MSG_SETUP_COMPLETE
private static final Message MSG_SETUP_FAILED
private static final Message MSG_NO_ASSETS
private final FlagArg forceFlag
