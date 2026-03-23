---
title: "VoiceRouter.ListenerCandidate"
kind: "record"
package: "com.hypixel.hytale.server.core.modules.voice"
fqcn: "com.hypixel.hytale.server.core.modules.voice.VoiceRouter.ListenerCandidate"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:55Z"
tags:
  - "voice"
  - "router"
  - "record"
---

**Package:** `com.hypixel.hytale.server.core.modules.voice`

```java
private record VoiceRouter.ListenerCandidate(UUID listenerId, double distSq, PacketHandler handler)
```

Internal record used during voice routing to track candidate listeners sorted by distance squared from the speaker.

## See Also

- [VoiceRouter](VoiceRouter.md)