# VoiceCommand.VoiceMaxDistanceCommand

Type: class | Package: com.hypixel.hytale.server.core.modules.voice.commands | Extends: AbstractCommand

public class VoiceCommand.VoiceMaxDistanceCommand extends AbstractCommand

Subcommand `/voice maxdistance <blocks>` that sets the maximum hearing distance.

## See Also

- VoiceCommand

Also in this package: VoiceCommand, VoiceEnabledCommand, VoiceFullVolumeDistanceCommand, VoiceMuteCommand, VoiceMutedListCommand, VoiceStatusCommand, VoiceUnmuteCommand

Complete API:
  protected CompletableFuture<Void> execute(CommandContext context)

Fields:
private final RequiredArg<Float> distanceArg
