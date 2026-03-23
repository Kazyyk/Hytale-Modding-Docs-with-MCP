# VoiceCommand.VoiceEnabledCommand

Type: class | Package: com.hypixel.hytale.server.core.modules.voice.commands | Extends: AbstractCommand

public class VoiceCommand.VoiceEnabledCommand extends AbstractCommand

Subcommand `/voice enabled <bool>` that enables or disables voice chat globally.

## See Also

- VoiceCommand

Also in this package: VoiceCommand, VoiceFullVolumeDistanceCommand, VoiceMaxDistanceCommand, VoiceMuteCommand, VoiceMutedListCommand, VoiceStatusCommand, VoiceUnmuteCommand

Complete API:
  protected CompletableFuture<Void> execute(CommandContext context)

Fields:
private final RequiredArg<Boolean> enabledArg
