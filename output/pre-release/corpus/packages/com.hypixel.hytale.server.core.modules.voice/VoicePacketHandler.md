# VoicePacketHandler

Type: class | Package: com.hypixel.hytale.server.core.modules.voice | Implements: SubPacketHandler

public class VoicePacketHandler implements SubPacketHandler

Sub-packet handler that rejects voice data received on the game stream. Voice data should be sent via the dedicated voice stream instead. Registers a handler for packet ID 450 (`VoiceData`) and logs a warning on the first rejection per connection.

## Methods

- void registerHandlers()
