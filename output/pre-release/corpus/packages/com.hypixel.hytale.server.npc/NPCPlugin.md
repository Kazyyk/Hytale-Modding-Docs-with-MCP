# NPCPlugin

Type: class | Package: com.hypixel.hytale.server.npc | Extends: JavaPlugin

public class NPCPlugin extends JavaPlugin

Central plugin for the NPC (non-player character) system. Manages the NPC component registry, builder factories, role definitions, blackboard systems, spawning, combat, movement, and all NPC-related asset loading. Registered as a `JavaPlugin` with the server plugin system.

Registers a comprehensive set of builder types for NPC behaviours including actions, sensors, body motions, head motions, entity filters, entity prioritisers, state machine transitions, timers, and audio-visual effects. Handles asset pack registration/unregistration events and migration support.

## Key Responsibilities

- Registers all NPC component types with the entity store registry
- Manages builder factories for NPC behaviour definitions (actions, sensors, motions, filters, etc.)
- Maintains role and descriptor indices
- Provides spatial resources (KD-tree) for NPC entity lookups
- Integrates with the flock system, combat system, and interaction system
- Handles NPC-related commands (`/npc`)
- Manages blackboard views (attitude, combat, block type, events)

## Access


public static NPCPlugin get()

Returns the singleton instance.
