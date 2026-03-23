---
title: "com.hypixel.hytale.builtin.beds.sleep.systems.player"
package: "com.hypixel.hytale.builtin.beds.sleep.systems.player"
generator_version: "2.0.0"
generated_at: "2026-03-21T06:08:32Z"
---

**Package:** `com.hypixel.hytale.builtin.beds.sleep.systems.player`

This package contains player-facing ECS systems for the bed/sleep feature. Handles bed entry validation, sleep tracker registration, multiplayer sleep notifications, sleep state packet synchronization, and wake-up on dismount.

## Classes

| Type | Description |
|---|---|
| [EnterBedSystem](EnterBedSystem.md) | Monitors mount component changes to detect when a player enters a bed |
| [RegisterTrackerSystem](RegisterTrackerSystem.md) | Ensures every player entity has a `SleepTracker` component when added to the store |
| [SleepNotificationSystem](SleepNotificationSystem.md) | Periodically checks sleep readiness and sends notification messages to awake players |
| [UpdateSleepPacketSystem](UpdateSleepPacketSystem.md) | Sends `UpdateSleepState` packets to players at 0 |
| [WakeUpOnDismountSystem](WakeUpOnDismountSystem.md) | Resets the player's somnolence state to AWAKE when they dismount from a bed |
