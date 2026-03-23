---
title: "AuthToken"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.auth"
fqcn: "com.hypixel.hytale.protocol.packets.auth.AuthToken"
api_surface: false
extends: null
implements: ["Packet", "ToServerPacket"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "protocol"
  - "packet"
  - "auth"
---

**Package:** `com.hypixel.hytale.protocol.packets.auth`

```java
public class AuthToken implements Packet, ToServerPacket
```

Client-to-server packet (ID 12) carrying an access token and server authorization grant. Sent by the client to authenticate with the server.
