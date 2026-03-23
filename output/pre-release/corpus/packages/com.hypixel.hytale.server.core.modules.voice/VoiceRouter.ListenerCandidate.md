# VoiceRouter.ListenerCandidate

Type: record | Package: com.hypixel.hytale.server.core.modules.voice

private record VoiceRouter.ListenerCandidate(UUID listenerId, double distSq, PacketHandler handler)

Internal record used during voice routing to track candidate listeners sorted by distance squared from the speaker.

## See Also

- VoiceRouter

Also in this package: PositionSnapshot, VoiceModule, VoiceModuleConfig, VoicePacketHandler, VoicePlayerState, VoiceRouter, VoiceStreamHandler
