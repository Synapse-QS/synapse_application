-- Remove legacy public tables with no current app/backend references and zero rows.
-- Deliberately exclude public.waitlist: it has a public insert policy and may serve an external signup flow.
-- RESTRICT prevents silently dropping dependent objects.
DROP TABLE IF EXISTS public.story_interactive_responses RESTRICT;
DROP TABLE IF EXISTS public.story_interactive_elements RESTRICT;
DROP TABLE IF EXISTS public.story_highlight_items RESTRICT;
DROP TABLE IF EXISTS public.story_replies RESTRICT;
DROP TABLE IF EXISTS public.story_mentions RESTRICT;
DROP TABLE IF EXISTS public.story_archive RESTRICT;
DROP TABLE IF EXISTS public.profile_likes RESTRICT;
DROP TABLE IF EXISTS public.likes RESTRICT;
DROP TABLE IF EXISTS public.bookmark_collections RESTRICT;
DROP TABLE IF EXISTS public.hidden_posts RESTRICT;
DROP TABLE IF EXISTS public.user_api_keys RESTRICT;
DROP TABLE IF EXISTS public.push_tokens RESTRICT;
DROP TABLE IF EXISTS public.tag_requests RESTRICT;
DROP TABLE IF EXISTS public.reel_opposers_log RESTRICT;
DROP TABLE IF EXISTS public.message_edit_history RESTRICT;
DROP TABLE IF EXISTS public.message_forwards RESTRICT;
DROP TABLE IF EXISTS public.typing_status RESTRICT;
DROP TABLE IF EXISTS public.changelogs RESTRICT;
DROP TABLE IF EXISTS public.syra_trigger_log RESTRICT;
DROP TABLE IF EXISTS public.family_connections RESTRICT;
