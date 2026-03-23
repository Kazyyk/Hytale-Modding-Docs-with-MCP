---
title: "VoicePacketHandler"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.voice"
fqcn: "com.hypixel.hytale.server.core.modules.voice.VoicePacketHandler"
api_surface: false
extends: ~
implements:
  - "SubPacketHandler"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:55Z"
tags:
  - "voice"
  - "packet"
  - "handler"
---

**Package:** `com.hypixel.hytale.server.core.modules.voice`

```java
public class VoicePacketHandler implements SubPacketHandler
```

Sub-packet handler that rejects voice data received on the game stream. Voice data should be sent via the dedicated voice stream instead. Registers a handler for packet ID 450 (`VoiceData`) and logs a warning on the first rejection per connection.

## Methods

| Method | Signature |
|---|---|
| `registerHandlers` | `void registerHandlers()` |