---
title: "com.hypixel.hytale.protocol.packets.stream"
kind: "package"
package: "com.hypixel.hytale.protocol.packets.stream"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:46Z"
tags:
  - "protocol"
  - "packet"
  - "stream"
---

**Package:** `com.hypixel.hytale.protocol.packets.stream`

Network packets for opening and managing data streams between client and server, such as game data and voice streams.

## Client-to-Server Packets

| Type | Description |
|---|---|
| [StreamOpen](StreamOpen.md) | Request to open a stream of a given type |

## Server-to-Client Packets

| Type | Description |
|---|---|
| [StreamOpenResponse](StreamOpenResponse.md) | Acceptance or rejection of a stream open request |

## Enums

| Type | Description |
|---|---|
| [StreamType](StreamType.md) | Stream type: `Game` or `Voice` |
