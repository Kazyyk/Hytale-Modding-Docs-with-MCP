---
title: "ClientReferral"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.auth"
fqcn: "com.hypixel.hytale.protocol.packets.auth.ClientReferral"
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
public class ClientReferral implements Packet, ToClientPacket
```

Server-to-client packet (ID 18) instructing the client to connect to a different server. Contains the target `HostAddress` and optional referral data.
