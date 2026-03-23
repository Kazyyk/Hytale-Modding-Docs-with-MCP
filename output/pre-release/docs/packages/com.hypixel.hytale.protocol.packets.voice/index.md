---
title: "com.hypixel.hytale.protocol.packets.voice"
kind: "package"
package: "com.hypixel.hytale.protocol.packets.voice"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:46Z"
tags:
  - "protocol"
  - "packet"
  - "voice"
---

**Package:** `com.hypixel.hytale.protocol.packets.voice`

Network packets for the voice chat system. Handles voice data transmission, configuration, and codec negotiation. Voice data packets use the dedicated `Voice` network channel.

## Client-to-Server Packets

| Type | Description |
|---|---|
| [VoiceData](VoiceData.md) | Opus-encoded voice data from the client |

## Server-to-Client Packets

| Type | Description |
|---|---|
| [RelayedVoiceData](RelayedVoiceData.md) | Voice data relayed from another player with spatial info |
| [VoiceConfig](VoiceConfig.md) | Server voice chat configuration (codec, distances, rate limits) |

## Enums

| Type | Description |
|---|---|
| [VoiceCodec](VoiceCodec.md) | Supported audio codecs (currently only `Opus`) |
