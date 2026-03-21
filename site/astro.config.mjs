import { defineConfig } from "astro/config";
import starlight from "@astrojs/starlight";

// https://astro.build/config
export default defineConfig({
  site: "https://hydex.dev",
  integrations: [
    starlight({
      title: "Hydex",
      description:
        "Comprehensive documentation for the Hytale dedicated server — every type, every method, every system.",
      customCss: ["./src/styles/custom.css"],
      sidebar: [
        { slug: "" },
        {
          label: "Plugin API",
          collapsed: false,
          items: [
            { label: "Plugin Core", autogenerate: { directory: "packages/com-hypixel-hytale-server-core-plugin" }, collapsed: true },
            { label: "Events", autogenerate: { directory: "packages/com-hypixel-hytale-event" }, collapsed: true },
            { label: "Player Events", autogenerate: { directory: "packages/com-hypixel-hytale-server-core-event" }, collapsed: true },
            { label: "ECS Framework", autogenerate: { directory: "packages/com-hypixel-hytale-component" }, collapsed: true },
            { label: "Commands", autogenerate: { directory: "packages/com-hypixel-hytale-server-core-command" }, collapsed: true },
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
            { label: "NPC", autogenerate: { directory: "packages/com-hypixel-hytale-server-npc" }, collapsed: true },
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
            { label: "Adventure", autogenerate: { directory: "packages/com-hypixel-hytale-builtin-adventure" }, collapsed: true },
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
            { label: "Asset Store", autogenerate: { directory: "packages/com-hypixel-hytale-assetstore" }, collapsed: true },
            { label: "Server Core Assets", autogenerate: { directory: "packages/com-hypixel-hytale-server-core-asset" }, collapsed: true },
          ],
        },
        {
          label: "Math & Utilities",
          collapsed: true,
          items: [
            { label: "Math", autogenerate: { directory: "packages/com-hypixel-hytale-math" }, collapsed: true },
            { label: "Common", autogenerate: { directory: "packages/com-hypixel-hytale-common" }, collapsed: true },
            { label: "Logging", autogenerate: { directory: "packages/com-hypixel-hytale-logger" }, collapsed: true },
            { label: "Metrics", autogenerate: { directory: "packages/com-hypixel-hytale-metrics" }, collapsed: true },
            { label: "Functions", autogenerate: { directory: "packages/com-hypixel-hytale-function" }, collapsed: true },
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
