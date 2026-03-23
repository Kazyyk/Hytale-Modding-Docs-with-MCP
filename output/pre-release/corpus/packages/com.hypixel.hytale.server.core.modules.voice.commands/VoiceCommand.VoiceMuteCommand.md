# VoiceCommand.VoiceMuteCommand

Type: class | Package: com.hypixel.hytale.server.core.modules.voice.commands | Extends: AbstractAsyncCommand

public class VoiceCommand.VoiceMuteCommand extends AbstractAsyncCommand

Subcommand `/voice mute <player>` that globally mutes a player by game profile lookup.

## See Also

- VoiceCommand

Also in this package: VoiceCommand, VoiceEnabledCommand, VoiceFullVolumeDistanceCommand, VoiceMaxDistanceCommand, VoiceMutedListCommand, VoiceStatusCommand, VoiceUnmuteCommand

Complete API:
  protected CompletableFuture<Void> executeAsync(CommandContext context)

Fields:
private final RequiredArg<ProfileServiceClient.PublicGameProfile> playerArg
