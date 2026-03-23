# ForcedMusicSystems

Type: class | Package: com.hypixel.hytale.builtin.ambience.systems

public class ForcedMusicSystems

Container for ECS systems managing forced music state. `PlayerAdded` ensures the ambience tracker component on player entities and clears music on removal. `Tick` compares the player's tracked music index against the world's forced music index and sends `UpdateEnvironmentMusic` packets on change.

Also in this package: AmbientEmitterSystems, EntityAdded, EntityRefAdded, PlayerAdded, Tick, Ticking
