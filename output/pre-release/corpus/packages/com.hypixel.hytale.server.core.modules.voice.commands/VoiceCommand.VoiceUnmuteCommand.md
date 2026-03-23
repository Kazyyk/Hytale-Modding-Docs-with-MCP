# VoiceCommand.VoiceUnmuteCommand

Type: class | Package: com.hypixel.hytale.server.core.modules.voice.commands | Extends: AbstractAsyncCommand

public class VoiceCommand.VoiceUnmuteCommand extends AbstractAsyncCommand

Subcommand `/voice unmute <player>` that globally unmutes a player by game profile lookup.

## See Also

- VoiceCommand

Also in this package: VoiceCommand, VoiceEnabledCommand, VoiceFullVolumeDistanceCommand, VoiceMaxDistanceCommand, VoiceMuteCommand, VoiceMutedListCommand, VoiceStatusCommand

Complete API:
  protected CompletableFuture<Void> executeAsync(CommandContext context)

Fields:
private final RequiredArg<ProfileServiceClient.PublicGameProfile> playerArg
