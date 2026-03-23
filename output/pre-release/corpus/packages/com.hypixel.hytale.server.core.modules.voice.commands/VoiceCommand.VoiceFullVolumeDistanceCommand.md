# VoiceCommand.VoiceFullVolumeDistanceCommand

Type: class | Package: com.hypixel.hytale.server.core.modules.voice.commands | Extends: AbstractCommand

public class VoiceCommand.VoiceFullVolumeDistanceCommand extends AbstractCommand

Subcommand `/voice fullvolumedistance <blocks>` that sets the distance at which voice is at full volume.

## See Also

- VoiceCommand

Also in this package: VoiceCommand, VoiceEnabledCommand, VoiceMaxDistanceCommand, VoiceMuteCommand, VoiceMutedListCommand, VoiceStatusCommand, VoiceUnmuteCommand

Complete API:
  protected CompletableFuture<Void> execute(CommandContext context)

Fields:
private final RequiredArg<Float> distanceArg
