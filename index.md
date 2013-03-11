---
layout: page
title: r351574nc3 Posts
tagline: 제 이름이 Inigo Montoya 입니다. 당신이 내 아버지를 죽였어. 죽을 준비해
---
## Posts

<ul class="posts">
  {% for post in site.posts %}
    <li><span>{{ post.date | date_to_string }}</span> &raquo; <a href="{{ BASE_PATH }}{{ post.url }}">{{ post.title }}</a></li>
  {% endfor %}
</ul>
