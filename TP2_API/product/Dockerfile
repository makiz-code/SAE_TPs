FROM python:3.12-slim

WORKDIR /usr/src/app

RUN pip install --no-cache-dir flask flask-restful

COPY . .

EXPOSE 80

CMD ["python", "api.py"]