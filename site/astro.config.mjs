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
        // Landing page
        { slug: "" },
        {
          label: "Plugin API",
          collapsed: false,
          items: [
            {
              label: "Plugin System",
              autogenerate: { directory: "packages/com-hypixel-hytale-plugin" },
              collapsed: true,
            },
            {
              label: "Plugin Core",
              autogenerate: { directory: "packages/com-hypixel-hytale-server-core-plugin" },
              collapsed: true,
            },
            {
              label: "Events",
              autogenerate: { directory: "packages/com-hypixel-hytale-event" },
              collapsed: true,
            },
            {
              label: "Player Events",
              autogenerate: { directory: "packages/com-hypixel-hytale-server-core-event-events-player" },
              collapsed: true,
            },
            {
              label: "ECS Events",
              autogenerate: { directory: "packages/com-hypixel-hytale-server-core-event-events-ecs" },
              collapsed: true,
            },
            {
              label: "ECS Framework",
              autogenerate: { directory: "packages/com-hypixel-hytale-component" },
              collapsed: true,
            },
            {
              label: "Commands",
              autogenerate: { directory: "packages/com-hypixel-hytale-server-core-command-system" },
              collapsed: true,
            },
            {
              label: "Entity",
              autogenerate: { directory: "packages/com-hypixel-hytale-server-core-entity" },
              collapsed: true,
            },
            {
              label: "World",
              autogenerate: { directory: "packages/com-hypixel-hytale-server-core-universe-world" },
              collapsed: true,
            },
            {
              label: "Inventory",
              autogenerate: { directory: "packages/com-hypixel-hytale-server-core-inventory" },
              collapsed: true,
            },
          ],
        },
        {
          label: "Game Systems",
          collapsed: true,
          items: [
            {
              label: "Damage & Combat",
              autogenerate: { directory: "packages/com-hypixel-hytale-server-core-modules-entity-damage" },
              collapsed: true,
            },
            {
              label: "NPC Systems",
              autogenerate: { directory: "packages/com-hypixel-hytale-server-npc-systems" },
              collapsed: true,
            },
            {
              label: "NPC Roles",
              autogenerate: { directory: "packages/com-hypixel-hytale-server-npc-role" },
              collapsed: true,
            },
            {
              label: "World Generation",
              autogenerate: { directory: "packages/com-hypixel-hytale-server-worldgen" },
              collapsed: true,
            },
            {
              label: "Spawning",
              autogenerate: { directory: "packages/com-hypixel-hytale-server-spawning" },
              collapsed: true,
            },
          ],
        },
        {
          label: "Assets & Codecs",
          collapsed: true,
          items: [
            {
              label: "Asset Store",
              autogenerate: { directory: "packages/com-hypixel-hytale-assetstore" },
              collapsed: true,
            },
            {
              label: "Codecs",
              autogenerate: { directory: "packages/com-hypixel-hytale-codec" },
              collapsed: true,
            },
          ],
        },
        {
          label: "Protocol",
          collapsed: true,
          items: [
            {
              label: "Types",
              autogenerate: { directory: "packages/com-hypixel-hytale-protocol" },
              collapsed: true,
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
