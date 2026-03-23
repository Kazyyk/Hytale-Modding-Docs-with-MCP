# UpdateSleepPacketSystem

Type: class | Package: com.hypixel.hytale.builtin.beds.sleep.systems.player | Extends: DelayedEntitySystem<EntityStore>

public class UpdateSleepPacketSystem extends DelayedEntitySystem<EntityStore>

Sends `UpdateSleepState` packets to players at 0.25s intervals. Generates gray fade, black screen, sleep clock, and multiplayer sleep status based on player/world sleep state.
