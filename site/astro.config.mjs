import { defineConfig } from "astro/config";
import starlight from "@astrojs/starlight";

// https://astro.build/config
export default defineConfig({
  site: "https://hydex.dev",
  integrations: [
    starlight({
      title: "Hydex",
      description:
        "Comprehensive documentation for the Hytale source — every type, every method, every system.",
      customCss: ["./src/styles/custom.css"],
      sidebar: [
        { slug: "" },
        {
          label: "Plugin API",
          collapsed: false,
          items: [
            { label: "Plugin Core", autogenerate: { directory: "packages/com-hypixel-hytale-server-core-plugin" }, collapsed: true },
            { label: "Events", autogenerate: { directory: "packages/com-hypixel-hytale-event" }, collapsed: true },
            {
              label: "Server Events",
              collapsed: true,
              items: [
                { label: "Player Events", autogenerate: { directory: "packages/com-hypixel-hytale-server-core-event-events-player" }, collapsed: true },
                { label: "ECS Events", autogenerate: { directory: "packages/com-hypixel-hytale-server-core-event-events-ecs" }, collapsed: true },
                { label: "Entity Events", autogenerate: { directory: "packages/com-hypixel-hytale-server-core-event-events-entity" }, collapsed: true },
                { label: "Permission Events", autogenerate: { directory: "packages/com-hypixel-hytale-server-core-event-events-permissions" }, collapsed: true },
                { label: "Event Base", autogenerate: { directory: "packages/com-hypixel-hytale-server-core-event-events" }, collapsed: true },
              ],
            },
            { label: "ECS Framework", autogenerate: { directory: "packages/com-hypixel-hytale-component" }, collapsed: true },
            {
              label: "Commands",
              collapsed: true,
              items: [
                { label: "Command System", autogenerate: { directory: "packages/com-hypixel-hytale-server-core-command-system" }, collapsed: true },
                { label: "Player Commands", autogenerate: { directory: "packages/com-hypixel-hytale-server-core-command-commands-player" }, collapsed: true },
                { label: "World Commands", autogenerate: { directory: "packages/com-hypixel-hytale-server-core-command-commands-world" }, collapsed: true },
                { label: "Debug Commands", autogenerate: { directory: "packages/com-hypixel-hytale-server-core-command-commands-debug" }, collapsed: true },
                { label: "Utility Commands", autogenerate: { directory: "packages/com-hypixel-hytale-server-core-command-commands-utility" }, collapsed: true },
              ],
            },
            { label: "Entity", autogenerate: { directory: "packages/com-hypixel-hytale-server-core-entity" }, collapsed: true },
            { label: "Inventory", autogenerate: { directory: "packages/com-hypixel-hytale-server-core-inventory" }, collapsed: true },
            { label: "Interactions", autogenerate: { directory: "packages/com-hypixel-hytale-server-core-modules-interaction" }, collapsed: true },
          ],
        },
        {
          label: "Game Systems",
          collapsed: true,
          items: [
            { label: "Damage & Combat", autogenerate: { directory: "packages/com-hypixel-hytale-server-core-modules-entity-damage" }, collapsed: true },
            { label: "Entity Systems", autogenerate: { directory: "packages/com-hypixel-hytale-server-core-modules-entity" }, collapsed: true },
            { label: "World", autogenerate: { directory: "packages/com-hypixel-hytale-server-core-universe" }, collapsed: true },
            {
              label: "NPC",
              collapsed: true,
              items: [
                { label: "NPC Systems", autogenerate: { directory: "packages/com-hypixel-hytale-server-npc-systems" }, collapsed: true },
                { label: "NPC Roles", autogenerate: { directory: "packages/com-hypixel-hytale-server-npc-role" }, collapsed: true },
                { label: "NPC Commands", autogenerate: { directory: "packages/com-hypixel-hytale-server-npc-commands" }, collapsed: true },
                { label: "NPC Movement", autogenerate: { directory: "packages/com-hypixel-hytale-server-npc-movement" }, collapsed: true },
                { label: "NPC Navigation", autogenerate: { directory: "packages/com-hypixel-hytale-server-npc-navigation" }, collapsed: true },
                { label: "NPC Instructions", autogenerate: { directory: "packages/com-hypixel-hytale-server-npc-instructions" }, collapsed: true },
                { label: "NPC Asset Builder", autogenerate: { directory: "packages/com-hypixel-hytale-server-npc-asset-builder" }, collapsed: true },
                { label: "NPC Core Components", autogenerate: { directory: "packages/com-hypixel-hytale-server-npc-corecomponents" }, collapsed: true },
                { label: "NPC Decision Maker", autogenerate: { directory: "packages/com-hypixel-hytale-server-npc-decisionmaker" }, collapsed: true },
                { label: "NPC Blackboard", autogenerate: { directory: "packages/com-hypixel-hytale-server-npc-blackboard" }, collapsed: true },
                { label: "NPC Expressions", autogenerate: { directory: "packages/com-hypixel-hytale-server-npc-util-expression" }, collapsed: true },
              ],
            },
            { label: "Spawning", autogenerate: { directory: "packages/com-hypixel-hytale-server-spawning" }, collapsed: true },
            { label: "Flock", autogenerate: { directory: "packages/com-hypixel-hytale-server-flock" }, collapsed: true },
          ],
        },
        {
          label: "World Generation",
          collapsed: true,
          items: [
            { label: "Server Worldgen", autogenerate: { directory: "packages/com-hypixel-hytale-server-worldgen" }, collapsed: true },
            { label: "Hytale Generator", autogenerate: { directory: "packages/com-hypixel-hytale-builtin-hytalegenerator" }, collapsed: true },
            { label: "Procedural Lib", autogenerate: { directory: "packages/com-hypixel-hytale-procedurallib" }, collapsed: true },
          ],
        },
        {
          label: "Builtin Modules",
          collapsed: true,
          items: [
            {
              label: "Adventure",
              collapsed: true,
              items: [
                { label: "Camera", autogenerate: { directory: "packages/com-hypixel-hytale-builtin-adventure-camera" }, collapsed: true },
                { label: "Farming", autogenerate: { directory: "packages/com-hypixel-hytale-builtin-adventure-farming" }, collapsed: true },
                { label: "Objectives", autogenerate: { directory: "packages/com-hypixel-hytale-builtin-adventure-objectives" }, collapsed: true },
                { label: "Memories", autogenerate: { directory: "packages/com-hypixel-hytale-builtin-adventure-memories" }, collapsed: true },
                { label: "Reputation", autogenerate: { directory: "packages/com-hypixel-hytale-builtin-adventure-reputation" }, collapsed: true },
                { label: "Shop", autogenerate: { directory: "packages/com-hypixel-hytale-builtin-adventure-shop" }, collapsed: true },
                { label: "Teleporter", autogenerate: { directory: "packages/com-hypixel-hytale-builtin-adventure-teleporter" }, collapsed: true },
                { label: "Stash", autogenerate: { directory: "packages/com-hypixel-hytale-builtin-adventure-stash" }, collapsed: true },
              ],
            },
            { label: "Builder Tools", autogenerate: { directory: "packages/com-hypixel-hytale-builtin-buildertools" }, collapsed: true },
            { label: "Crafting", autogenerate: { directory: "packages/com-hypixel-hytale-builtin-crafting" }, collapsed: true },
            { label: "Mounts", autogenerate: { directory: "packages/com-hypixel-hytale-builtin-mounts" }, collapsed: true },
            { label: "Portals", autogenerate: { directory: "packages/com-hypixel-hytale-builtin-portals" }, collapsed: true },
            { label: "Instances", autogenerate: { directory: "packages/com-hypixel-hytale-builtin-instances" }, collapsed: true },
            { label: "Beds & Sleep", autogenerate: { directory: "packages/com-hypixel-hytale-builtin-beds" }, collapsed: true },
            { label: "Teleport", autogenerate: { directory: "packages/com-hypixel-hytale-builtin-teleport" }, collapsed: true },
            { label: "Deployables", autogenerate: { directory: "packages/com-hypixel-hytale-builtin-deployables" }, collapsed: true },
            { label: "Weather", autogenerate: { directory: "packages/com-hypixel-hytale-builtin-weather" }, collapsed: true },
            { label: "NPC Combat AI", autogenerate: { directory: "packages/com-hypixel-hytale-builtin-npccombatactionevaluator" }, collapsed: true },
            { label: "Ambience", autogenerate: { directory: "packages/com-hypixel-hytale-builtin-ambience" }, collapsed: true },
            { label: "Asset Editor", autogenerate: { directory: "packages/com-hypixel-hytale-builtin-asseteditor" }, collapsed: true },
            { label: "Parkour", autogenerate: { directory: "packages/com-hypixel-hytale-builtin-parkour" }, collapsed: true },
            { label: "Path System", autogenerate: { directory: "packages/com-hypixel-hytale-builtin-path" }, collapsed: true },
            { label: "Block Physics", autogenerate: { directory: "packages/com-hypixel-hytale-builtin-blockphysics" }, collapsed: true },
            { label: "Block Spawner", autogenerate: { directory: "packages/com-hypixel-hytale-builtin-blockspawner" }, collapsed: true },
            { label: "Block Tick", autogenerate: { directory: "packages/com-hypixel-hytale-builtin-blocktick" }, collapsed: true },
            { label: "Random Tick", autogenerate: { directory: "packages/com-hypixel-hytale-builtin-randomtick" }, collapsed: true },
            { label: "Command Macro", autogenerate: { directory: "packages/com-hypixel-hytale-builtin-commandmacro" }, collapsed: true },
            { label: "Creative Hub", autogenerate: { directory: "packages/com-hypixel-hytale-builtin-creativehub" }, collapsed: true },
          ],
        },
        {
          label: "Networking",
          collapsed: true,
          items: [
            { label: "Protocol Types", autogenerate: { directory: "packages/com-hypixel-hytale-protocol" }, collapsed: true },
          ],
        },
        {
          label: "Data & Serialization",
          collapsed: true,
          items: [
            { label: "Codec", autogenerate: { directory: "packages/com-hypixel-hytale-codec" }, collapsed: true },
            {
              label: "Asset Store",
              collapsed: true,
              items: [
                { label: "Asset Codecs", autogenerate: { directory: "packages/com-hypixel-hytale-assetstore-codec" }, collapsed: true },
                { label: "Asset Events", autogenerate: { directory: "packages/com-hypixel-hytale-assetstore-event" }, collapsed: true },
                { label: "Asset Maps", autogenerate: { directory: "packages/com-hypixel-hytale-assetstore-map" }, collapsed: true },
              ],
            },
            { label: "Server Core Assets", autogenerate: { directory: "packages/com-hypixel-hytale-server-core-asset" }, collapsed: true },
          ],
        },
        {
          label: "Math & Utilities",
          collapsed: true,
          items: [
            { label: "Math", autogenerate: { directory: "packages/com-hypixel-hytale-math" }, collapsed: true },
            {
              label: "Common",
              collapsed: true,
              items: [
                { label: "Benchmark", autogenerate: { directory: "packages/com-hypixel-hytale-common-benchmark" }, collapsed: true },
                { label: "Collections", autogenerate: { directory: "packages/com-hypixel-hytale-common-collection" }, collapsed: true },
                { label: "Maps", autogenerate: { directory: "packages/com-hypixel-hytale-common-map" }, collapsed: true },
                { label: "Semver", autogenerate: { directory: "packages/com-hypixel-hytale-common-semver" }, collapsed: true },
                { label: "Plugin Utils", autogenerate: { directory: "packages/com-hypixel-hytale-common-plugin" }, collapsed: true },
                { label: "Utilities", autogenerate: { directory: "packages/com-hypixel-hytale-common-util" }, collapsed: true },
              ],
            },
            { label: "Logging", autogenerate: { directory: "packages/com-hypixel-hytale-logger" }, collapsed: true },
            { label: "Metrics", autogenerate: { directory: "packages/com-hypixel-hytale-metrics" }, collapsed: true },
            {
              label: "Functions",
              collapsed: true,
              items: [
                { label: "Consumers", autogenerate: { directory: "packages/com-hypixel-hytale-function-consumer" }, collapsed: true },
                { label: "Functions", autogenerate: { directory: "packages/com-hypixel-hytale-function-function" }, collapsed: true },
                { label: "Predicates", autogenerate: { directory: "packages/com-hypixel-hytale-function-predicate" }, collapsed: true },
                { label: "Suppliers", autogenerate: { directory: "packages/com-hypixel-hytale-function-supplier" }, collapsed: true },
              ],
            },
          ],
        },
        {
          label: "JSON Schemas",
          autogenerate: { directory: "schemas" },
        },
      ],
      head: [
        {
          tag: "meta",
          attrs: {
            name: "robots",
            content: "index, follow",
          },
        },
      ],
      lastUpdated: true,
    }),
  ],
});
