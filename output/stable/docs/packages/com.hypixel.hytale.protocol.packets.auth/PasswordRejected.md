---
title: "PasswordRejected"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.auth"
fqcn: "com.hypixel.hytale.protocol.packets.auth.PasswordRejected"
api_surface: false
extends: null
implements: ["Packet", "ToClientPacket"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "protocol"
  - "packet"
  - "auth"
---

**Package:** `com.hypixel.hytale.protocol.packets.auth`

```java
public class PasswordRejected implements Packet, ToClientPacket
```

Server-to-client packet (ID 17) indicating a password was rejected. Carries a new challenge and the number of remaining attempts.
