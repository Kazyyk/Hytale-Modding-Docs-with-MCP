---
title: "com.hypixel.hytale.protocol.packets.setup"
kind: "package"
package: "com.hypixel.hytale.protocol.packets.setup"
fqcn: "com.hypixel.hytale.protocol.packets.setup"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "protocol"
  - "packet"
  - "setup"
---

**Package:** `com.hypixel.hytale.protocol.packets.setup`

Setup and configuration network packets for the Hytale client-server protocol. Handles asset transfer, client feature negotiation, player options, server tags, time dilation, update rate, view radius, world loading progress, and world settings.

## Types

| Type | Kind | Description |
|---|---|---|
| [AssetFinalize](AssetFinalize.md) | class | Server-to-client packet (ID 26) signaling that asset transfer is complete. |
| [AssetInitialize](AssetInitialize.md) | class | Server-to-client packet (ID 24) initiating transfer of a single asset. |
| [AssetPart](AssetPart.md) | class | Server-to-client packet (ID 25) carrying a chunk of asset data as a byte array. |
| [ClientFeature](ClientFeature.md) | enum | Enumeration of client-side features that can be toggled by the server: SplitVelocity, Mantling, SprintForce, CrouchSlide, SafetyRoll, DisplayHealthBars, DisplayCombatText, CanHideHelmet, CanHideCuirass, CanHideGauntlets, CanHidePants. |
| [PlayerOptions](PlayerOptions.md) | class | Client-to-server packet (ID 33) containing the player's skin data via a `PlayerSkin` object. |
| [RemoveAssets](RemoveAssets.md) | class | Server-to-client packet (ID 27) instructing the client to remove an array of assets. |
| [RequestAssets](RequestAssets.md) | class | Client-to-server packet (ID 23) requesting transfer of specified assets. |
| [RequestCommonAssetsRebuild](RequestCommonAssetsRebuild.md) | class | Server-to-client packet (ID 28) requesting the client rebuild its common assets cache. |
| [ServerTags](ServerTags.md) | class | Server-to-client packet (ID 34) carrying a map of server tag names to integer indices. |
| [SetTimeDilation](SetTimeDilation.md) | class | Server-to-client packet (ID 29) setting the time dilation factor as a float value. |
| [SetUpdateRate](SetUpdateRate.md) | class | Server-to-client packet (ID 35) setting the server's tick update rate as a float value. |
| [UpdateFeatures](UpdateFeatures.md) | class | Server-to-client packet (ID 30) carrying an array of `ClientFeature` enum values indicating which features are enabled. |
| [ViewRadius](ViewRadius.md) | class | Server-to-client packet (ID 31) specifying the view radius as an integer value. |
| [WorldLoadFinished](WorldLoadFinished.md) | class | Server-to-client packet (ID 22) signaling that world loading is complete. |
| [WorldLoadProgress](WorldLoadProgress.md) | class | Server-to-client packet (ID 21) reporting world loading progress as a float value between 0 and 1. |
| [WorldSettings](WorldSettings.md) | class | Server-to-client packet (ID 20) carrying world configuration including game mode, world time, daylight hours, and moon phase. |
