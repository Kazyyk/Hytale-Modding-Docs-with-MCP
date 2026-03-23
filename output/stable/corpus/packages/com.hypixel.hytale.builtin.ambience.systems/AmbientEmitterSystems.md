# AmbientEmitterSystems

Type: class | Package: com.hypixel.hytale.builtin.ambience.systems

public class AmbientEmitterSystems

Container for ECS systems managing ambient sound emitter entities. `EntityAdded` ensures network ID, intangible, and prefab-copyable components. `EntityRefAdded` spawns a child audio entity with the emitter's sound event. `Ticking` synchronizes the child entity's position and removes orphaned emitters.
